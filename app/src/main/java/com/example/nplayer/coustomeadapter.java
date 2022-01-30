package com.example.nplayer;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.File;
import java.util.List;

public class coustomeadapter extends RecyclerView.Adapter<videoviewholder> {
    private Context context;
    private List<File> files;
    private selectlistener listener;

    public coustomeadapter(Context context, List<File> files, selectlistener listener) {
        this.context = context;
        this.files = files;
        this.listener = listener;

    }

    @NonNull
    @Override
    public videoviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new videoviewholder(LayoutInflater.from(context).inflate(R.layout.coustome_list,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull videoviewholder holder, int position) {
        holder.txtname.setText(files.get(position).getName());
        holder.txtname.setSelected(true);

        Bitmap thumb = ThumbnailUtils.createVideoThumbnail(files.get(position).getAbsolutePath(),
                MediaStore.Images.Thumbnails.MINI_KIND);

        holder.imgthumbnail.setImageBitmap(thumb);

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.ONFILECLICKED(files.get(position));
            }
        });

    }

    @Override
    public int getItemCount() {
        return files.size();
    }
}
