package com.bytecode.cforcoding;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {

    private ImageView Insta;
    private TextView Gmail,Address;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        getSupportActionBar().setTitle("About Us");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Insta = (ImageView) findViewById(R.id.Insta);
        Gmail = (TextView) findViewById(R.id.mail);
        Address = (TextView) findViewById(R.id.Map);

        Insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://instagram.com/the_coding_girl_1999?igshid=YmMyMTA2M2Y=");
            }
        });
        Gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setDataAndType(Uri.parse("email"),"message/rfc822");
                String[] email = {"manishkrsingh2645@gmail.com"};
                intent.putExtra(Intent.EXTRA_EMAIL,email);
                intent.putExtra(Intent.EXTRA_SUBJECT,"This is the Subject");
                intent.putExtra(Intent.EXTRA_TEXT,"This is the mail Body");
                Intent chooser = Intent.createChooser(intent,"Launch E-mail");
                startActivity(chooser);


            }
        });
        Address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://maps.google.com/?cid=3966948287268047979&entry=gps");
            }
        });

    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}