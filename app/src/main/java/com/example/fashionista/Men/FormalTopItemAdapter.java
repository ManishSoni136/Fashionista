package com.example.fashionista.Men;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fashionista.R;

import java.util.ArrayList;
import java.util.List;

public class FormalTopItemAdapter extends RecyclerView.Adapter<FormalTopItemAdapter.MyViewHolder> {

    Context context;
    ArrayList<FormalTopItem> mList;

    public FormalTopItemAdapter(Context context, ArrayList<FormalTopItem> mList) {
        this.context = context;
        this.mList = mList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.each_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        FormalTopItem item = mList.get(position);
        holder.desc.setText(item.getItemName());
        holder.stock.setText(item.getStock());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageUrl;
        TextView desc, stock;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageUrl = itemView.findViewById(R.id.itemImage);
            desc = itemView.findViewById(R.id.itemDesc);
            stock = itemView.findViewById(R.id.itemStock);
        }
    }
}

