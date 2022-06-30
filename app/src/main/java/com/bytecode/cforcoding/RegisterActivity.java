package com.bytecode.cforcoding;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterActivity extends AppCompatActivity {

    private Button Login,Go;
    private TextInputLayout Name,Age,Gender,Email,Pass;
    ImageView profile;

    private FirebaseDatabase firebase;
    private FirebaseAuth firebaseAuth;
    private ProgressDialog progressDialog;
    private DatabaseReference databaseReference;
    private static  final String USER = "user";
    private static  final String TAG = "RegisterActivity";
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        getSupportActionBar().setTitle("Register Activity");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Login = (Button) findViewById(R.id.login);
        Go = (Button) findViewById(R.id.Register1);
        Name = (TextInputLayout) findViewById(R.id.name);
        Age = (TextInputLayout) findViewById(R.id.age);
        Gender = (TextInputLayout) findViewById(R.id.gender);
        Email = (TextInputLayout) findViewById(R.id.username);
        Pass = (TextInputLayout) findViewById(R.id.password);

        firebase = FirebaseDatabase.getInstance();
        databaseReference = firebase.getReference(USER);
        firebaseAuth = FirebaseAuth.getInstance();
        progressDialog = new ProgressDialog(this);


        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });

        Go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    String email = Email.getEditText().getText().toString();
                    String pass = Pass.getEditText().getText().toString();
                    if (TextUtils.isEmpty(email) || TextUtils.isEmpty(pass)) {
                        Toast.makeText(getApplicationContext(), "Enter All the Fields!", Toast.LENGTH_LONG).show();
                        return;
                    }
                    String fullName = Name.getEditText().getText().toString();
                    String age = Age.getEditText().getText().toString();
                    String gender = Gender.getEditText().getText().toString();
                    user = new User(fullName, age, gender, email, pass);
                    RegisterUser(email, pass);
                    progressDialog.setMessage("Please wait");
                    progressDialog.show();
                }

        });
    }
    public void RegisterUser(String email, String pass){
        firebaseAuth.createUserWithEmailAndPassword(email, pass)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d(TAG, "signInWithEmailAndPassword:success");
                            FirebaseUser user = firebaseAuth.getCurrentUser();
                            updateUI(user);
                            progressDialog.dismiss();
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w(TAG, "signInWithEmailAndPassword:failure", task.getException());
                            Toast.makeText(RegisterActivity.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
                            progressDialog.dismiss();

                        }
                    }
                });
    }
    public void updateUI(FirebaseUser currentUser){
        String keyId = databaseReference.push().getKey();
        databaseReference.child(keyId).setValue(user);
        Intent intent = new Intent(RegisterActivity.this,LoginActivity.class);
        startActivity(intent);
        finish();
    }
}