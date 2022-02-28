package com.example.listacustom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

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
//        String[] titles = params.getStringArray("titles");
        this.titles = params.getStringArray("titles");
        System.out.println("titulo: "+this.titles[2]);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                this.titles
        );

        TextView textName = findViewById(R.id.name);
        ImageView imageView = findViewById(R.id.symbol);
        TextView textCity = findViewById(R.id.city);
        TextView textState = findViewById(R.id.state);
        ListView list = findViewById(R.id.titles);

        textName.setText(this.name);
        imageView.setImageResource(this.image);
        textCity.setText("Cidade: "+this.city);
        textState.setText("Estado: "+this.state);
        list.setAdapter(adapter);
    }
}