package com.hacketon.prototipo;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hacketon.prototipo.Constans.Constantes;
import com.hacketon.prototipo.adapterHuellas.AdapterHuellas;
import com.hacketon.prototipo.adapterMotos.AdapterMotos;

public class Activity_Descripcion extends Activity {
    RecyclerView recyclerView;
    AdapterHuellas adapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion);
        createListHardcode();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new GridLayoutManager(Activity_Descripcion.this, 1));
        adapter = new AdapterHuellas(Activity_Descripcion.this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
    }
    public void createListHardcode(){

        String Marca ="ALberto 1";

        int i =0;
        while(i<3){
            Constantes.ListaHuellas.add(Marca);
            i++;
        }
    }

}
