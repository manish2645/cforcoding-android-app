package com.bytecode.cforcoding;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class ViewHolder extends RecyclerView.ViewHolder {

    View view;

    public ViewHolder(View itemView) {
        super(itemView);

        view = itemView;

    }
    public void setDetails(Context context,String title, String image){
        TextView mTitleV = view.findViewById(R.id.titleView);
        ImageView mImageV = view.findViewById(R.id.imageView);
        mTitleV.setText(title);
        Picasso.get().load(image).into(mImageV);

        Animation animation = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
        itemView.startAnimation(animation);
    }
}
