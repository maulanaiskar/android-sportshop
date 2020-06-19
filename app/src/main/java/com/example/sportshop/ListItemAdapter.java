package com.example.sportshop;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListItemAdapter extends RecyclerView.Adapter<ListItemAdapter.ListViewHolder> {
    private ArrayList<Item> listItem;

    public ListItemAdapter(ArrayList<Item> list) {

        this.listItem = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        final Item item = listItem.get(position);
        Glide.with(holder.itemView.getContext())
                .load(item.getPhotoItem())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.tvName.setText(item.getNameItem());
        holder.tvDetail.setText(item.getDetailItem());

        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(), Detail.class);
                intent.putExtra(Detail.EXTRA_NAME_ITEM, listItem.get(holder.getAdapterPosition()).getNameItem());
                intent.putExtra(Detail.EXTRA_DETAIL_ITEM,listItem.get(holder.getAdapterPosition()).getDetailItem());
                intent.putExtra(Detail.EXTRA_IMG_ITEM, listItem.get(holder.getAdapterPosition()).getPhotoItem());
                intent.putExtra(Detail.EXTRA_PRICE_ITEM,listItem.get(holder.getAdapterPosition()).getPriceItem());
                intent.putExtra(Detail.EXTRA_ULASAN_ITEM,listItem.get(holder.getAdapterPosition()).getUlasanItem());
                holder.itemView.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listItem.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail, tvPrice, tvUlasan;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail =  itemView.findViewById(R.id.tv_item_detail);
            tvPrice = itemView.findViewById(R.id.tv_item_price);
            tvUlasan = itemView.findViewById(R.id.tv_item_ulasan);
        }
    }
}
