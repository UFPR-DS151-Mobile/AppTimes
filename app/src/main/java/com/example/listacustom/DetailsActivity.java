package com.example.listacustom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class DetailsActivity extends AppCompatActivity {

    private String name;
    private int image;
    private String city;
    private String state;
    private String[] titles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent it = getIntent();
        if (it == null) return;

        Bundle params = it.getExtras();
        if (params == null) return;

        this.name = params.getString("name", "");
        this.image = params.getInt("image", -1);
        this.city = params.getString("city", "");
        this.state = params.getString("state", "");
        this.titles = params.getStringArray("titles");


    }
}