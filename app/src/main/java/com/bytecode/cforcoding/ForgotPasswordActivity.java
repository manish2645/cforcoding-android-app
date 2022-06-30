package com.bytecode.cforcoding;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;

public class ForgotPasswordActivity extends AppCompatActivity {

    private TextInputLayout Email;
    private Button FPassword;
    private String email;

    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        getSupportActionBar().setTitle("Forgot Password Activity");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Email = (TextInputLayout) findViewById(R.id.email);
        FPassword = (Button) findViewById(R.id.forgot);
        firebaseAuth = FirebaseAuth.getInstance();

        FPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateData();
            }
        });
    }

    private void validateData() {
        email = Email.getEditText().getText().toString();
        if(email.isEmpty()){
            Email.setError("Required");
        }
        else{
            forgotPassword();
        }
    }

    private void forgotPassword() {
        firebaseAuth.sendPasswordResetEmail(email)
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(ForgotPasswordActivity.this, "Check Your Email in spam folder!",Toast.LENGTH_LONG).show();
                            startActivity(new Intent(ForgotPasswordActivity.this,LoginActivity.class));
                            finish();
                        }
                        else {
                            Toast.makeText(ForgotPasswordActivity.this,"Error : "+task.getException().getMessage(),Toast.LENGTH_LONG).show();
                        }
                    }
                });
    }
}