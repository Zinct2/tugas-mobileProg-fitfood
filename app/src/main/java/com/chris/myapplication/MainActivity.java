package com.chris.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

//    String[] cities = {"Jakarta", "Bandung"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMove = findViewById(R.id.buttonSubmit);


        ArrayList<Product> products = new ArrayList<Product>();
        products.add(new Product("Toy Flags", 4000, R.mipmap.usa_foreground));
        products.add(new Product("Noodles", 20000, R.mipmap.ichiran_foreground));
        products.add(new Product("Portable Consoles", 3000000, R.mipmap.nintendo_foreground));
        products.add(new Product("Gaming Consoles", 10000000, R.mipmap.ps5_foreground));

        RecyclerView recyclerViewProduct = (RecyclerView) findViewById(R.id.recyclerViewProduct);
        ProductAdapter productAdapter = new ProductAdapter(products);
        recyclerViewProduct.setAdapter(productAdapter);
        recyclerViewProduct.setLayoutManager(new LinearLayoutManager(this));

        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ListViewActivity.class));
            }
        });


//        ListView listViewCity = (ListView) findViewById(R.id.listViewCity);
//        ArrayAdapter arrayAdapter = new ArrayAdapter<>(this, R.layout.listview, cities);
//        listViewCity.setAdapter(arrayAdapter);
    }

    public void doSubmit(View view) {


    }
}