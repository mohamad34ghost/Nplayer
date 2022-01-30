package com.example.nplayer;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class videoviewholder extends RecyclerView.ViewHolder {
    public ImageView imgthumbnail;
    public TextView txtname;
    public CardView cardView;
    public videoviewholder(@NonNull View itemView) {
        super(itemView);
        imgthumbnail = itemView.findViewById(R.id.imgthumbnail);
        txtname = itemView.findViewById(R.id.txtname);
        cardView = itemView.findViewById(R.id.main_container);
    }
}