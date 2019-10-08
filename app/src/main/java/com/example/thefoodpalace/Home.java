package com.example.thefoodpalace;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Home extends AppCompatActivity {
    ImageView mImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().setTitle("Home");

        Toast.makeText(Home.this, "Welcome", Toast.LENGTH_SHORT).show();

        mImage = findViewById(R.id.fries);
        mImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, Order.class));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.menu_profile:
                startActivity(new Intent(Home.this, Profile.class));
                break;

            case R.id.menu_settings:
                startActivity(new Intent(Home.this, Settings.class));
                break;
            case R.id.menu_order:
                startActivity(new Intent(Home.this, Order.class));
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}
