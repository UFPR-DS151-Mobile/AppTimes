package com.example.listacustom.controller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.listacustom.R;
import com.example.listacustom.adapter.AdapterLista;
import com.example.listacustom.model.Time;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerViewLista;
    private List<Time> listaTimes = new ArrayList<>();

    public void criarTime(){
        Time obj = new Time(R.drawable.cruzeiro, "Cruzeiro", "Belo Horizonte", "Minas Gerais");
        listaTimes.add(obj);

        obj = new Time(R.drawable.botafogo, "Botafogo", "Rio de Janeiro (Capital)", "Rio de Janeiro");
        listaTimes.add(obj);

        obj = new Time(R.drawable.flamengo, "Flamengo", "Rio de Janeiro (Capital)", "Rio de Janeiro");
        listaTimes.add(obj);

        obj = new Time(R.drawable.sp, "São Paulo", "São Paulo (Capital)", "São Paulo");
        listaTimes.add(obj);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewLista = findViewById(R.id.recyclerViewLista);

        this.criarTime();
        AdapterLista adapter = new AdapterLista(listaTimes);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());

        recyclerViewLista.setLayoutManager(layoutManager);
        recyclerViewLista.setHasFixedSize(true);
        recyclerViewLista.addItemDecoration(new DividerItemDecoration(this,LinearLayout.VERTICAL));
        recyclerViewLista.setAdapter(adapter);
    }
}