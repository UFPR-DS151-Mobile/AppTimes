package com.example.listacustom.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.listacustom.R;
import com.example.listacustom.model.Time;

import java.util.List;

public class AdapterLista extends RecyclerView.Adapter<AdapterLista.MyViewHolder> {
     private List<Time> listTimes;

     public AdapterLista(List<Time> list){
            this.listTimes = list;
     }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView nomeTime, cidTime, estTime;
        ImageView logoTime;

        public MyViewHolder(View view){
            super(view);
            nomeTime = view.findViewById(R.id.textViewNomeTime);
            cidTime = view.findViewById(R.id.textViewCidTime);
            estTime = view.findViewById(R.id.textViewEstTime);

            logoTime = view.findViewById(R.id.imageViewTime);

        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View listItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapt_list_custom, parent, false);
        return new MyViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Time obj = listTimes.get(position);
        holder.estTime.setText(obj.getNomeEst());
        holder.cidTime.setText(obj.getNomeCid());
        holder.nomeTime.setText(obj.getNomeTime());
        holder.logoTime.setImageResource(obj.getLogoTime());
    }

    @Override
    public int getItemCount() {
        return listTimes.size();
    }
}
