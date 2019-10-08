package com.example.thefoodpalace;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Order extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        getSupportActionBar().setTitle("Order");
    }
}
