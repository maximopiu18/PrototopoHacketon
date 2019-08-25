package com.hacketon.prototipo.adapterMotos;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.hacketon.prototipo.Activity_Descripcion;
import com.hacketon.prototipo.Constans.Constantes;
import com.hacketon.prototipo.R;


public class AdapterMotos extends RecyclerView.Adapter<HolderMotos>  {
    public static int posicionHeroe;
    private Context context;


    public AdapterMotos(Context context) {
        this.context = context;
    }

    @Override
    public HolderMotos onCreateViewHolder(ViewGroup parent, final int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_motos, parent, false);
        return new HolderMotos(view);
    }

    @Override
    public void onBindViewHolder(final HolderMotos holder, final int position) {


        holder.tvName.setText(Constantes.ListaMarca.get(position));
        holder.tvModel.setText(Constantes.ListaModelo.get(position));
        holder.tvDate.setText(Constantes.ListaFecha.get(position));
        if(position==0) {
            holder.ivModelo.setImageResource(R.drawable.img_moto);
        }
        if(position==1) {
            holder.ivModelo.setImageResource(R.drawable.img_moto2);
        }
        if(position==2) {
            holder.ivModelo.setImageResource(R.drawable.img_moto3);
        }

        holder.itemLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.e("position", "position: " + position);
                posicionHeroe = position;
                Intent intent = new Intent(context, Activity_Descripcion.class);
                context.startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return Constantes.ListaMarca.size();
    }

}

