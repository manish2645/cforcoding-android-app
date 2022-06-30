package com.bytecode.cforcoding;

import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bytecode.cforcoding.databinding.ActivityNotesBinding;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;


public class NotesActivity extends DrawerBase {

    ActivityNotesBinding activityNotesBinding;
    //FloatingActionButton fb;
    RecyclerView recyclerView;
    myAdapterView adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityNotesBinding = ActivityNotesBinding.inflate(getLayoutInflater());
        setContentView(activityNotesBinding.getRoot());
        allocateActivityTitle("Notes");

        /*fb=(FloatingActionButton)findViewById(R.id.fab);
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),UploadNotes.class));
            }
        });*/

        recyclerView = (RecyclerView)findViewById(R.id.recView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        FirebaseRecyclerOptions<model>options=
                new FirebaseRecyclerOptions.Builder<model>()
                .setQuery(FirebaseDatabase.getInstance().getReference().child("Notes"),model.class)
                .build();

        adapter = new myAdapterView(options);
        recyclerView.setAdapter(adapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        adapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        adapter.stopListening();
    }
}