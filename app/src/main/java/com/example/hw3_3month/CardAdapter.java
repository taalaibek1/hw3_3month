package com.example.hw3_3month;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder>{
    private final List<Cards> cards;
    private final LayoutInflater inflater;


    public CardAdapter (Context context, List<Cards> cards){
        this.cards = cards;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_card, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Cards card = cards.get(position);
        holder.imageView.setImageResource(card.getImage());
    }
    @Override
    public int getItemCount(){
        return cards.size();
        }



        public static class ViewHolder extends RecyclerView.ViewHolder {
            final ImageView imageView;


            ViewHolder(View view) {
                super(view);
                imageView = view.findViewById(R.id.iv_card);

            }
        }



}
