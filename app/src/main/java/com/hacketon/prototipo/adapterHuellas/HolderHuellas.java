package com.hacketon.prototipo.adapterHuellas;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.hacketon.prototipo.R;


public class HolderHuellas extends RecyclerView.ViewHolder {

    ImageView ivModelo;
    TextView tvName;
    TextView tvModel;
    TextView tvDate;
    LinearLayout itemLinear;
    public HolderHuellas(View itemView) {
        super(itemView);
        ivModelo = (ImageView) itemView.findViewById(R.id.item_image);
        tvName = (TextView) itemView.findViewById(R.id.item_name);
    }
    
}
