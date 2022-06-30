package com.bytecode.cforcoding;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class myAdapterView  extends FirebaseRecyclerAdapter<model,myAdapterView.myViewHolder> {

    public myAdapterView(@NonNull FirebaseRecyclerOptions<model> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myViewHolder holder, int position, @NonNull model model) {
        holder.header.setText(model.getFilename());

        //holder.textviewbook.setText(String.valueOf(model.getNov()));
        //holder.textlike.setText(String.valueOf(model.getNol()));
        //holder.textdislike.setText(String.valueOf(model.getNod()));

        holder.img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.img1.getContext(),ViewPdf.class);
                intent.putExtra("filename",model.getFilename());
                intent.putExtra("fileurl",model.getFileurl());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                holder.img1.getContext().startActivity(intent);
            }
        });

    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.notesdesign,parent,false);
        return new myViewHolder(view);
    }

    public class myViewHolder extends RecyclerView.ViewHolder{

        ImageView img1;
        TextView header;
        //ImageView readbook,likebook,dislikebook;
        //TextView textviewbook,textlike,textdislike;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            img1=itemView.findViewById(R.id.img1);
            header=itemView.findViewById(R.id.header);

            //readbook=itemView.findViewById(R.id.readbook);
            //likebook=itemView.findViewById(R.id.likebook);
            //dislikebook=itemView.findViewById(R.id.dislikebook);

            //textviewbook=itemView.findViewById(R.id.textviewbook);
            //textlike=itemView.findViewById(R.id.textlike);
           // textdislike=itemView.findViewById(R.id.textdislike);


        }
    }
}
