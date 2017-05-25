package com.cooking.info.cooking.Adapter;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.cooking.info.cooking.Entities.Cooking;
import com.cooking.info.cooking.Fragment.DetailFragment;
import com.cooking.info.cooking.R;

import java.util.List;

/**
 * Created by Naser on 5/24/2017.
 */

public class CookingAdapter extends RecyclerView.Adapter<CookingAdapter.MyViewHolder> {

    private Context mContext;
    private List<Cooking> cookingList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, description, seen , publishDate;
        public ImageView thumbnail;
        public CardView cardView;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.txtTitle);
            description = (TextView) view.findViewById(R.id.txtDescription);
            seen = (TextView) view.findViewById(R.id.txtSeen);
            publishDate = (TextView) view.findViewById(R.id.txtPublishDate);
            thumbnail = (ImageView) view.findViewById(R.id.imgThumbnail);
            cardView = (CardView) view.findViewById(R.id.card_view);
        }
    }

    public CookingAdapter(Context mContext, List<Cooking> cookies) {
        this.mContext = mContext;
        this.cookingList = cookies;
    }

    @Override
    public CookingAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cooking_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CookingAdapter.MyViewHolder holder, int position) {
        final Cooking cooking = cookingList.get(position);
        String description = cooking.getDescription();
        if(description.length() > 100)
            description = description.substring(0,100) + " ... ";

        holder.title.setText(cooking.getName());
        holder.description.setText(description);
        holder.seen.setText(String.valueOf(cooking.getSeen()));
        holder.publishDate.setText(cooking.getCreateDate());

        Glide.with(mContext).load(cooking.getImageUrl()).into(holder.thumbnail);

    }

    @Override
    public int getItemCount() {
        return cookingList.size();
    }
}
