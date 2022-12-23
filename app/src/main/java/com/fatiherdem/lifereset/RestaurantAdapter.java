package com.fatiherdem.lifereset;
import android.app.Activity;
import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



import java.util.ArrayList;
import java.util.List;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.MyViewHolder> {
    Context context;
    ArrayList<Restaurant> list;

    public RestaurantAdapter(Context context, ArrayList<Restaurant> list) {
        this.context = context;
        this.list = list;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.restaurant_row,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantAdapter.MyViewHolder holder, int position) {
        Restaurant restaurant = list.get(position);
        holder.restaurantName.setText(restaurant.getName());
        holder.restaurantDensity.setText(restaurant.getDensity());
        holder.restaurantDistance.setText( restaurant.getDistance());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView restaurantName,restaurantDensity,restaurantDistance;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            restaurantName = itemView.findViewById(R.id.txtRestaurantName);
            restaurantDensity = itemView.findViewById(R.id.txtRestaurantDensity);
            restaurantDistance = itemView.findViewById(R.id.txtRestaurantDistance);

        }
    }

}