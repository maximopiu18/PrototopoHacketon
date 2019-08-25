package com.hacketon.prototipo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityLogin extends AppCompatActivity {

    Button btn_inciar;
    EditText ed_usuario, ed_contrasena;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btn_inciar = (Button)findViewById(R.id.btn_iniciar_sesion);
        ed_usuario =(EditText)findViewById(R.id.ed_usuario);
        ed_contrasena =(EditText)findViewById(R.id.ed_contrasena);

        btn_inciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityLogin.this, ActivityMotosRegistradas.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
