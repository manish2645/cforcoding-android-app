package com.bytecode.cforcoding;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;

public class UploadNotes extends AppCompatActivity {

    ImageView imageBrowse,fileLogo,cancelFile;
    Button uploadFile;
    EditText selectFile;
    Uri filepath;

    StorageReference storageReference;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_notes);

        getSupportActionBar().setTitle("Upload Notes");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        storageReference= FirebaseStorage.getInstance().getReference();
        databaseReference=FirebaseDatabase.getInstance().getReference().child("Notes");

        selectFile = findViewById(R.id.filetitle);
        fileLogo = findViewById(R.id.filelogo);
        cancelFile = findViewById(R.id.cancelfile);
        imageBrowse=findViewById(R.id.imageBrowse);
        uploadFile = findViewById(R.id.buttonUpload);

        fileLogo.setVisibility(View.INVISIBLE);
        cancelFile.setVisibility(View.INVISIBLE);

        cancelFile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fileLogo.setVisibility(View.INVISIBLE);
                cancelFile.setVisibility(View.INVISIBLE);
                imageBrowse.setVisibility(View.VISIBLE);
            }
        });

        imageBrowse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dexter.withContext(getApplicationContext())
                        .withPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                        .withListener(new PermissionListener() {
                            @Override
                            public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {

                                Intent intent = new Intent();
                                intent.setType("application/pdf");
                                intent.setAction(Intent.ACTION_GET_CONTENT);
                                startActivityForResult(Intent.createChooser(intent,"Select Pdf Files"),101);
                            }

                            @Override
                            public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {

                            }

                            @Override
                            public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
                                permissionToken.continuePermissionRequest();
                            }
                        }).check();
            }
        });
        uploadFile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processUpload(filepath);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==101 && resultCode==RESULT_OK)
        {
            filepath = data.getData();
            fileLogo.setVisibility(View.VISIBLE);
            cancelFile.setVisibility(View.VISIBLE);
            imageBrowse.setVisibility(View.INVISIBLE);
        }
    }
    public void processUpload(Uri filepath)
    {
        ProgressDialog pd = new ProgressDialog(this);
        pd.setTitle("File Uploading....!!!");
        pd.show();
        final StorageReference reference = storageReference.child("uploads/"+System.currentTimeMillis()+".pdf");
        reference.putFile(filepath)
                .addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                    @Override
                    public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                            reference.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                                @Override
                                public void onSuccess(Uri uri) {
                                    fileinfomodel obj=new fileinfomodel(selectFile.getText().toString(),uri.toString());
                                    databaseReference.child(databaseReference.push().getKey()).setValue(obj);
                                    pd.dismiss();
                                    Toast.makeText(getApplicationContext(),"File Uploaded",Toast.LENGTH_LONG).show();
                                    fileLogo.setVisibility(View.INVISIBLE);
                                    cancelFile.setVisibility(View.INVISIBLE);
                                    imageBrowse.setVisibility(View.VISIBLE);
                                    selectFile.setText("");
                                }
                            });
                    }
                })
                .addOnProgressListener(new OnProgressListener<UploadTask.TaskSnapshot>() {
                    @Override
                    public void onProgress(@NonNull UploadTask.TaskSnapshot snapshot) {
                        float percent =(100*snapshot.getBytesTransferred())/snapshot.getTotalByteCount();
                        pd.setMessage("Uploaded : "+(int)percent+"%");
                    }
                });
    }
}