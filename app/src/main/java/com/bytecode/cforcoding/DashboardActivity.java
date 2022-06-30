package com.bytecode.cforcoding;

import androidx.appcompat.app.AlertDialog;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.bytecode.cforcoding.databinding.ActivityDashboardBinding;

public class DashboardActivity extends DrawerBase {

    ActivityDashboardBinding binding;

    CardView NumPattern, AlphaPattern, SymPattern, MisProgram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDashboardBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        allocateActivityTitle("Dashboard");

        NumPattern = (CardView) findViewById(R.id.textView1);
        AlphaPattern = (CardView) findViewById(R.id.textView2);
        SymPattern = (CardView) findViewById(R.id.textView3);
        MisProgram = (CardView) findViewById(R.id.textView4);

        NumPattern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this,NumberPattern.class));
            }
        });

        AlphaPattern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this,AlphabetPattern.class));
            }
        });

        SymPattern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this,SymbolPattern.class));
            }
        });

        MisProgram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this,MiscellaneousProgram.class));
            }
        });
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(R.drawable.ic_warning)
                .setTitle("Go back to Login Page!")
                .setMessage("Are you sure?")
                .setNegativeButton(android.R.string.no, null)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface arg0, int arg1)
                    {
                        finishAffinity();
                    }
                }).create().show();
    }
}