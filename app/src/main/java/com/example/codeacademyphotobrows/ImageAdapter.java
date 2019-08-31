package com.example.codeacademyphotobrows;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.net.URI;
import java.util.List;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ViewHolder> {


    public ImageAdapter(List<Uri> k) {


    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutItemForImageItem = R.layout.image_list_itm;
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(layoutItemForImageItem, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageViewHolder;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewHolder = itemView.findViewById(R.id.image_items);
        }

        void bind(View view) {
            imageViewHolder.setImageResource(R.drawable.ic_launcher_background);
        }

    }

}
