package com.bytecode.cforcoding;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.bytecode.cforcoding.databinding.ActivityQuizBinding;

public class QuizActivity extends DrawerBase {

    ActivityQuizBinding activityQuizBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityQuizBinding = ActivityQuizBinding.inflate(getLayoutInflater());
        setContentView(activityQuizBinding.getRoot());
        allocateActivityTitle("C Quiz");

        Button startButton = (Button) findViewById(R.id.StartQuiz);
        final EditText nameText = (EditText) findViewById(R.id.name);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = nameText.getText().toString();
                Intent intent=new Intent(getApplicationContext(),QuestionActivity.class);
                intent.putExtra("myname",name);
                startActivity(intent);
            }
        });
    }
}