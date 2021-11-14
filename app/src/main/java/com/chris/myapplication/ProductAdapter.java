package com.chris.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder> {

    private ArrayList<Product> products;
    LayoutInflater layoutInflater;

    public ProductAdapter(ArrayList<Product> products){
        this.products = products;
    }
    @NonNull
    @Override
    public ProductAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        layoutInflater = LayoutInflater.from(context);

        View viewContact = layoutInflater.inflate(R.layout.item_recyclerviewproduct, parent, false);
        ViewHolder viewHolder = new ViewHolder(viewContact);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ProductAdapter.ViewHolder holder, int position) {
        Product product = products.get(position);

        TextView textProductName = holder.textProduction;
        ImageView imageView = (ImageView) holder.image;
        textProductName.setText(product.getName() + "(" + product.getPrice() + " " + ")");
        imageView.setImageResource(product.getStock());
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView textProduction;
        public ImageView image;
        public Button buttonBuy;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textProduction = itemView.findViewById(R.id.textViewProductName);
            image = itemView.findViewById(R.id.imageView);
        }
    }
//    public View getView(int i, View view, ViewGroup viewGroup) {
//        view = layoutInflater.inflate(R.layout.listview, null);
//        TextView product = (TextView)           view.findViewById(R.id.textViewProductName);
//        ImageView icon = (ImageView) view.findViewById(R.id.imageView);
//        product.setText(products[i]);
//        icon.setImageResource(flags[i]);
//        return view;
//    }
}
