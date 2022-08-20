package com.example.cw7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<Items> Items=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Items> items = new ArrayList<>();
        Items items1 = new Items("chesse", R.drawable.cheese, 0.640);
        Items items2 = new Items("chocolate", R.drawable.chocolate, 0.250);
        Items items3 = new Items("coffe", R.drawable.coffee, 1.010);
        Items items4 = new Items("donut", R.drawable.donut, 0.950);
        Items items5 = new Items("honey", R.drawable.honey, 4.750);
        Items items6 = new Items("fries", R.drawable.fries, 0.770);

        Items.add(items1);
        Items.add(items2);
        Items.add(items3);
        Items.add(items4);
        Items.add(items5);
        Items.add(items6);

        itemsAdapter itemsAdapter=new itemsAdapter(this,0,items);
        ListView listView=findViewById(R.id.listView);
        listView.setAdapter(itemsAdapter);




    }
}