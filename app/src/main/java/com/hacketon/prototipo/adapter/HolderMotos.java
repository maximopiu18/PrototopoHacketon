package com.hacketon.prototipo.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.hacketon.prototipo.R;


public class HolderMotos extends RecyclerView.ViewHolder {

    ImageView ivModelo;
    TextView tvName;
    TextView tvModel;
    TextView TvDate;
    public HolderMotos(View itemView) {
        super(itemView);
        ivModelo = (ImageView) itemView.findViewById(R.id.item_image);
        tvName = (TextView) itemView.findViewById(R.id.item_marca);
        tvName = (TextView) itemView.findViewById(R.id.item_modelo);
        tvName = (TextView) itemView.findViewById(R.id.item_fecha_entrega);
    }
    
}
