package com.hacketon.prototipo;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hacketon.prototipo.Constans.Constantes;
import com.hacketon.prototipo.adapter.AdapterMotos;

public class ActivityMotosRegistradas extends Activity {
    RecyclerView recyclerView;
    AdapterMotos adapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motos_registradas);
        createListHardcode();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new GridLayoutManager(ActivityMotosRegistradas.this, 1));
        adapter = new AdapterMotos(ActivityMotosRegistradas.this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
    }

    public void createListHardcode(){

        String Marca ="Italika";
        String Modelo = "Modelo Sport";
        String Fecha = "-04-2017";

        int i =0;
        while(i<20){
            Constantes.ListaMarca.add(Marca);
            Constantes.ListaModelo.add(Modelo+" " + i);
            Constantes.ListaFecha.add(i+"0"+Fecha+"" );
            i++;
        }
    }

}
