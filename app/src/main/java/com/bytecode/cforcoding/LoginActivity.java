package com.bytecode.cforcoding;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {

    Button Register;
    private TextInputLayout Username, Password;
    private Button Login,ForgetPassword;
    CheckBox Remember;

    private FirebaseAuth firebaseAuth;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().setTitle("Login Activity");

        Register = (Button) findViewById(R.id.register);
        Username = (TextInputLayout) findViewById(R.id.username);
        Password = (TextInputLayout) findViewById(R.id.password);
        Login = (Button) findViewById(R.id.login);
        ForgetPassword = (Button) findViewById(R.id.forgetPass);
        Remember = (CheckBox) findViewById(R.id.remember);

        SharedPreferences preferences = getSharedPreferences("checkbox",MODE_PRIVATE);
        String checkbox = preferences.getString("Remember","");
        if(checkbox.equals("true")){
            Intent intent = new Intent(LoginActivity.this,DashboardActivity.class);
            startActivity(intent);
        }else if (checkbox.equals("false")){
            Toast.makeText(this,"Please Sign In",Toast.LENGTH_SHORT).show();
        }

        firebaseAuth = FirebaseAuth.getInstance();
        progressDialog = new ProgressDialog(this);
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();


        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });
        ForgetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,ForgotPasswordActivity.class);
                startActivity(intent);
            }
        });

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputName = Username.getEditText().getText().toString();
                String inputPassword = Password.getEditText().getText().toString();
                if (inputName.isEmpty() || inputPassword.isEmpty()){
                    Toast.makeText(LoginActivity.this,"Please Enter All The Details",Toast.LENGTH_LONG).show();
                }else
                    validate(Username.getEditText().getText().toString(), Password.getEditText().getText().toString());

            }
        });

        Remember.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if(compoundButton.isChecked()){
                    SharedPreferences preferences = getSharedPreferences("checkbox",MODE_PRIVATE);
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putString("Remember","true");
                    editor.apply();
                    Toast.makeText(LoginActivity.this,"Checked",Toast.LENGTH_SHORT).show();

                }else if(!compoundButton.isChecked()){
                    SharedPreferences preferences = getSharedPreferences("checkbox",MODE_PRIVATE);
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putString("Remember","false");
                    editor.apply();
                    Toast.makeText(LoginActivity.this,"Unchecked",Toast.LENGTH_SHORT).show();

                }
            }
        });

    }
    public void validate(String username, String password){
        progressDialog.setMessage("Please wait");
        progressDialog.show();
        firebaseAuth.signInWithEmailAndPassword(username, password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            progressDialog.dismiss();
                            Toast.makeText(LoginActivity.this,"Login Successful", Toast.LENGTH_LONG).show();
                            Intent intent = new Intent(LoginActivity.this,DashboardActivity.class);
                            startActivity(intent);
                            finish();

                        }else{
                            progressDialog.dismiss();
                            Toast.makeText(LoginActivity.this,"Login Failed", Toast.LENGTH_LONG).show();
                        }

                    }
                });
    }
    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(R.drawable.ic_warning)
                .setTitle("Exit!")
                .setMessage("Are you sure?")
                .setNegativeButton(android.R.string.no, null)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface arg0, int arg1) {

                        finishAffinity();

                    }
                }).create().show();
    }
}