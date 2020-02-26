package com.example.anslee;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView fulname,lat,lon;
    ImageView mapIcon;
    CardView cardView;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        cardView = itemView.findViewById(R.id.cardViewId);

        fulname = itemView.findViewById(R.id.feedUserFullnameId);
//        lat = itemView.findViewById(R.id.feedDateId);
//        lon = itemView.findViewById(R.id.feedTimeId);
        mapIcon = itemView.findViewById(R.id.mapIconId);



    }
}
