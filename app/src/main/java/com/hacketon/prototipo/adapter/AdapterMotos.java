package com.hacketon.prototipo.adapter;

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


     /*   holder.tvName.setText(modeloList.get(position).getName());
       // Log.e("TAG: ", "imgUrl :" + modelo.getDescripcion());
        Picasso.with(context).load(modeloList.get(position).getPhoto())
                .resize(200,300)
                .centerInside()
                .placeholder(R.drawable.logo_marvel)
                .error(R.drawable.logo_marvel)
                .into(holder.ivModelo);*/


        holder.ivModelo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.e("position", "position: " + position);
                posicionHeroe = position;
                Intent intent = new Intent(context, Activity_Descripcion.class);
                context.startActivity(intent);



                //((Activity) context).setResult(RESULT_OK);
                //((Activity) context).finish();
                //  ((Activity) context).overridePendingTransition(R.anim.fade_in, R.anim.fade_out);

               //   ((Activity) context).overridePendingTransition(R.anim.fade_in, R.anim.fade_out);


  /*              Constantes.positionSuperheroe = position;
                Intent intent = new Intent(context, Activity_Description.class);
                context.startActivity(intent);*/
                //((Activity) context).setResult(RESULT_OK);
                //((Activity) context).finish();
              //  ((Activity) context).overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        });
    }
    @Override
    public int getItemCount() {
        return Constantes.ListaMarca.size();
    }

}

