package com.hacketon.prototipo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hacketon.prototipo.Constans.Constantes;
import com.hacketon.prototipo.adapterHuellas.AdapterHuellas;
import com.hacketon.prototipo.adapterMotos.AdapterMotos;

public class Activity_Descripcion extends Activity {
    ImageView img_moto;
    TextView tv_marca, tv_modelo, tv_fecha;


    FrameLayout frameLista, frameRegistar;
    Button btn_registar_moto1;
    Button btn_registar_moto2;
    ImageView btn_back;
    RecyclerView recyclerView;
    AdapterHuellas adapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion);

        img_moto = (ImageView)findViewById(R.id.img_moto);
        tv_marca = (TextView)findViewById(R.id.tv_marca);
        tv_modelo = (TextView)findViewById(R.id.tv_modelo);
        tv_fecha = (TextView)findViewById(R.id.tv_fecha);

        btn_registar_moto1 =(Button)findViewById(R.id.btn_registrarmoto1);
        btn_registar_moto2 =(Button)findViewById(R.id.btn_registrarmoto2);
        frameLista =(FrameLayout)findViewById(R.id.frameLista);
        frameRegistar =(FrameLayout)findViewById(R.id.frameregistrahuella);
        btn_back =(ImageView)findViewById(R.id.img_back);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new GridLayoutManager(Activity_Descripcion.this, 1));
        adapter = new AdapterHuellas(Activity_Descripcion.this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
        validarLista();
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_Descripcion.this, ActivityMotosRegistradas.class);
                startActivity(intent);
                finish();
            }
        });
        btn_registar_moto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_Descripcion.this, Activity_RegistroHuella.class);
                startActivity(intent);
                finish();
            }
        });
        btn_registar_moto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_Descripcion.this, Activity_RegistroHuella.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void validarLista()
    {
        if(Constantes.ListaHuellas.size()==0)
        {
            frameRegistar.setVisibility(View.VISIBLE);
            frameLista.setVisibility(View.INVISIBLE);
        }
        else{

            frameRegistar.setVisibility(View.INVISIBLE);
            frameLista.setVisibility(View.VISIBLE);
        }
        llenarCaracteristicas();
    }

    public void llenarCaracteristicas(){
        if(Constantes.positionMoto==0) {
            img_moto.setImageResource(R.drawable.img_moto);
        }
        if(Constantes.positionMoto==1) {
            img_moto.setImageResource(R.drawable.img_moto2);
        }
        if(Constantes.positionMoto==2) {
            img_moto.setImageResource(R.drawable.img_moto3);
        }
        tv_fecha.setText(Constantes.ListaFecha.get(Constantes.positionMoto));
        tv_marca.setText(Constantes.ListaMarca.get(Constantes.positionMoto));
        tv_modelo.setText(Constantes.ListaModelo.get(Constantes.positionMoto));
    }
}
