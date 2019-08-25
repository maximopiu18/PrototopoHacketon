package com.hacketon.prototipo.adapterMotos;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.hacketon.prototipo.R;


public class HolderMotos extends RecyclerView.ViewHolder {

    ImageView ivModelo;
    TextView tvName;
    TextView tvModel;
    TextView tvDate;
    LinearLayout itemLinear;
    public HolderMotos(View itemView) {
        super(itemView);
        ivModelo = (ImageView) itemView.findViewById(R.id.item_image);
        tvName = (TextView) itemView.findViewById(R.id.item_marca);
        tvModel = (TextView) itemView.findViewById(R.id.item_modelo);
        tvDate = (TextView) itemView.findViewById(R.id.item_fecha_entrega);
        itemLinear = (LinearLayout) itemView.findViewById(R.id.item_layout);
    }
    
}
