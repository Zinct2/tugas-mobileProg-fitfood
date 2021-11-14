package com.chris.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListViewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Button btnMove = findViewById(R.id.buttonSubmit);


        Vector<Product> products = new Vector<>();
        products.add(new Product("American Flag", 4000, R.mipmap.usa_foreground));
        products.add(new Product("Ichiran Ramen", 20000, R.mipmap.ichiran_foreground));
        products.add(new Product("Nintendo Switch", 3000000, R.mipmap.nintendo_foreground));
        products.add(new Product("Playstation 5", 10000000, R.mipmap.ps5_foreground));

        ListView listViewProduct = (ListView) findViewById(R.id.listViewCity);
        ListViewAdapter productAdapter = new ListViewAdapter(getApplicationContext(),products);
        listViewProduct.setAdapter(productAdapter);


        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });


//        ListView listViewCity = (ListView) findViewById(R.id.listViewCity);
//        ArrayAdapter arrayAdapter = new ArrayAdapter<>(this, R.layout.listview, cities);
//        listViewCity.setAdapter(arrayAdapter);


    }




}
