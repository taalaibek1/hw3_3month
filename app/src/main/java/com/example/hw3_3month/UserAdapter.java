package com.example.hw3_3month;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {
    private final List<Users> users;
    private final LayoutInflater inflater;

    public UserAdapter(Context context, List<Users> users) {
        this.users = users;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_user, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Users user = users.get(position);
        holder.nameView.setText(user.getName());
        holder.ageView.setText(String.valueOf(user.getAge()));
        holder.imageView.setImageResource(user.getImage());
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView imageView;
        final TextView nameView;
        final TextView ageView;

        ViewHolder(View view) {
            super(view);
            imageView = view.findViewById(R.id.iv_user);
            nameView = view.findViewById(R.id.tv_name);
            ageView = view.findViewById(R.id.tv_age);
        }
    }
}
