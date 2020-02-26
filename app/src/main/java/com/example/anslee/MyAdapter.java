package com.example.anslee;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;


public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private List<PosoClass> MyItem;
    Context context;

    public MyAdapter(List<PosoClass> myItem, Context context) {
        MyItem = myItem;
        this.context = context;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sample,viewGroup,false);
        MyViewHolder MVH = new MyViewHolder(view);
        return MVH;


    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder myViewHolder, final int i) {
        final PosoClass itemPosition = MyItem.get(i);

        myViewHolder.cardView.setAnimation(AnimationUtils.loadAnimation(context, R.anim.fade_scale_animation));


        myViewHolder.fulname.setText(itemPosition.getName());
//        myViewHolder.lat.setText(itemPosition.getLatitude());
//        myViewHolder.lon.setText(itemPosition.getLongititude());

        myViewHolder.mapIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lat = itemPosition.getLatitude();
                String lon = itemPosition.getLongititude();
                Intent intent = new Intent(context,MapsActivity.class);
                intent.putExtra("lat",lat);
                intent.putExtra("lon",lon);
                context.startActivity(intent);
            }
        });

    }


    @Override
    public int getItemCount() {
        return MyItem.size();
    }
}
