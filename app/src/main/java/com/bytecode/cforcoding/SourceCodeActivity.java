package com.bytecode.cforcoding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SourceCodeActivity extends AppCompatActivity {

    ImageView Output,Video;
    TextView SourceCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_source_code);

        getSupportActionBar().setTitle("Source Code");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        int output = getIntent().getIntExtra("Output Image",0);
        String sourceCode = getIntent().getStringExtra("Source Code");
        int video = getIntent().getIntExtra("Video Icon",0);

        Output = (ImageView) findViewById(R.id.output);
        SourceCode = (TextView) findViewById(R.id.sourcecode);
        Video = (ImageView) findViewById(R.id.videoButton);

        Output.setImageResource(output);
        SourceCode.setText(sourceCode);
        Video.setImageResource(video);

        Video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://youtube.com/playlist?list=PL7ersPsTyYt2prN058WfA_j3ElgwD1bht");
            }
        });
    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }

}