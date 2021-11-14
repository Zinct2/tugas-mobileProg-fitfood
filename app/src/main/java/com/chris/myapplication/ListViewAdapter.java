package com.chris.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Vector;

public class ListViewAdapter extends BaseAdapter {
    Context context;
    LayoutInflater productInflater;
    private Vector<Product> products;

    public ListViewAdapter(Context context, Vector<Product> products) {
        this.context = context;
        this.products = products;
        productInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return products.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = productInflater.inflate(R.layout.listview, null);
        TextView product_txt = (TextView) view.findViewById(R.id.textViewProductName);
        ImageView product_img = (ImageView) view.findViewById(R.id.imageView);

        product_txt.setText(products.get(i).getName());
        product_img.setImageResource(products.get(i).getStock());
        return view;
    }
}