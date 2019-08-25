package com.hacketon.prototipo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hacketon.prototipo.Constans.Constantes;
import com.hacketon.prototipo.adapterMotos.AdapterMotos;

public class ActivityMotosRegistradas extends Activity {

    RecyclerView recyclerView;
    AdapterMotos adapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motos_registradas);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new GridLayoutManager(ActivityMotosRegistradas.this, 1));
        adapter = new AdapterMotos(ActivityMotosRegistradas.this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
    }

}
