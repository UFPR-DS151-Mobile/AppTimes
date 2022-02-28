package com.example.listacustom.controller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;

import com.example.listacustom.DetailsActivity;
import com.example.listacustom.R;
import com.example.listacustom.RecyclerItemClickListener;
import com.example.listacustom.adapter.AdapterLista;
import com.example.listacustom.model.Time;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerViewLista;
    private List<Time> listaTimes = new ArrayList<>();

    public void criarTime(){
        Time obj = new Time(
                R.drawable.cruzeiro,
                "Cruzeiro",
                "Belo Horizonte",
                "Minas Gerais",
                new String[]{
                        "Campeonato Mineiro (2019)",
                        "Campeonato Brasileiro (2014)",
                        "Copa do Brasil (2018)"
                }
        );
        listaTimes.add(obj);

        obj = new Time(
                R.drawable.botafogo,
                "Botafogo",
                "Rio de Janeiro (Capital)",
                "Rio de Janeiro",
                new String[]{
                        "Campeonato Carioca (2018)",
                        "Campeonato Brasileiro - Série B (2021)",
                        "Taça Guanabara (2015)"
                }
        );
        listaTimes.add(obj);

        obj = new Time(
                R.drawable.flamengo,
                "Flamengo",
                "Rio de Janeiro (Capital)",
                "Rio de Janeiro",
                new String[]{
                        "Recopa Sul-Americana (2020)",
                        "Campeonato Brasileiro (2020)",
                        "Supercopa do Brasil (2021)"
                }
                );
        listaTimes.add(obj);

        obj = new Time(
                R.drawable.sp,
                "São Paulo",
                "São Paulo (Capital)",
                "São Paulo",
                new String[]{
                        "Campeonato Paulista (2021)",
                        "Campeonato Brasileiro (2008)",
                        "Copa Libertadores da América (2005)"
                }
                );
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

        recyclerViewLista.addOnItemTouchListener(
                new RecyclerItemClickListener(
                        getApplicationContext(),
                        recyclerViewLista,
                        new RecyclerItemClickListener.OnItemClickListener() {
                            @Override
                            public void onItemClick(View view, int position) {
                                Time time = listaTimes.get(position);
                                callDetailsActivity(time);
                            }

                            @Override
                            public void onLongItemClick(View view, int position) {

                            }

                            @Override
                            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                            }
                        }
                )
        );
    }

    public void callDetailsActivity(Time time) {
        Intent it = new Intent(this, DetailsActivity.class);
        Bundle params = new Bundle();
        params.putString("name", time.getNomeTime());
        params.putInt("image", time.getLogoTime());
        params.putString("city", time.getNomeCid());
        params.putString("state", time.getNomeEst());
        params.putStringArray("titles", time.getTitulos());
    }
}