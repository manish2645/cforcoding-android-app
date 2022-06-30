package com.bytecode.cforcoding;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SymbolAdapter extends RecyclerView.Adapter<NumberAdapter.MyViewHolder> {
    private  final  RecyclerViewInterface recyclerViewInterface;
    Context context;
    ArrayList<PatternModel> patternModels;

    public SymbolAdapter(Context context, ArrayList<PatternModel> patternModels,RecyclerViewInterface recyclerViewInterface){
        this.context=context;
        this.patternModels = patternModels;
        this.recyclerViewInterface = recyclerViewInterface;
    }

    @NonNull
    @Override
    public NumberAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_view_row,parent,false);

        return new NumberAdapter.MyViewHolder(view, recyclerViewInterface);
    }

    @Override
    public void onBindViewHolder(@NonNull NumberAdapter.MyViewHolder holder, int position) {
        holder.textView.setText(patternModels.get(position).getText());
        holder.imageView.setImageResource(patternModels.get(position).getImage());


    }

    @Override
    public int getItemCount() {
        return patternModels.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView;
        public MyViewHolder(@NonNull View itemView, RecyclerViewInterface recyclerViewInterface) {
            super(itemView);

            imageView = itemView.findViewById(R.id.p1);
            textView = itemView.findViewById(R.id.txt1);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (recyclerViewInterface != null){
                        int pos = getAdapterPosition();
                        if(pos != RecyclerView.NO_POSITION){
                            recyclerViewInterface.onItemClick(pos);
                        }
                    }
                }
            });
        }

    }
}
