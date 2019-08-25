package com.hacketon.prototipo.adapterHuellas;

import android.app.Activity;
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
import com.hacketon.prototipo.adapterMotos.HolderMotos;


public class AdapterHuellas extends RecyclerView.Adapter<HolderHuellas>  {
    public static int posicionHeroe;
    private Context context;


    public AdapterHuellas(Context context) {
        this.context = context;
    }

    @Override
    public HolderHuellas onCreateViewHolder(ViewGroup parent, final int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_huellas, parent, false);
        return new HolderHuellas(view);
    }

    @Override
    public void onBindViewHolder(final HolderHuellas holder, final int position) {

          holder.tvName.setText(Constantes.ListaHuellas.get(position));
          if(position !=0)
          {
              holder.tv_roll.setText("Invitado");
          }
        holder.ivDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Constantes.ListaHuellas.remove(position);
                Intent intent = new Intent(context, Activity_Descripcion.class);
                context.startActivity(intent);
                ((Activity) context).finish();
            }
        });
    }
    @Override
    public int getItemCount() {
        return Constantes.ListaHuellas.size();
    }

}

