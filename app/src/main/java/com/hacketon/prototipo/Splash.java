package com.hacketon.prototipo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;

public class Splash extends AppCompatActivity {
MyAsyck asyck;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        asyck = new MyAsyck();
        asyck.execute("");
    }
    public class MyAsyck extends AsyncTask{

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected Object doInBackground(Object[] objects) {
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Object o) {
            super.onPostExecute(o);
            login();
        }
    }
    public void login(){
        Intent intent = new Intent(Splash.this, ActivityLogin.class);
        startActivity(intent);
        finish();
    }
}
