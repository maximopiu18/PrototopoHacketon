package com.hacketon.prototipo;


import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;

import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.core.app.ActivityCompat;

import com.hacketon.prototipo.Constans.Constantes;


@RequiresApi(api = Build.VERSION_CODES.M)
public class FingerprintHandler extends FingerprintManager.AuthenticationCallback {

    private CancellationSignal cancellationSignal;
    private Context context;


    public FingerprintHandler(Context mContext) {
        context = mContext;
    }

    public void startAuth(FingerprintManager manager, FingerprintManager.CryptoObject cryptoObject) {
        cancellationSignal = new CancellationSignal();
        if (ActivityCompat.checkSelfPermission(context, Manifest.permission.USE_FINGERPRINT) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        manager.authenticate(cryptoObject, cancellationSignal, 0, this, null);
    }

    @Override
    public void onAuthenticationError(int errMsgId,
                                      CharSequence errString) {
      //  Toast.makeText(context, "Authentication error\n" + errString, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onAuthenticationFailed() {
       // Toast.makeText(context, "Authentication failed", Toast.LENGTH_LONG).show();
        if(Constantes.flujo ==0) {
            Intent intent = new Intent(context, ActivityMotosRegistradas.class);
            context.startActivity(intent);
            ((Activity) context).finish();
        }
        else if(Constantes.flujo ==1){
            Activity_RegistroHuella.tv_registro.setText("! Registro Exitoso ¡");
            Activity_RegistroHuella.img_success.setImageResource(R.drawable.ic_accept_whilte);
            Activity_RegistroHuella.img_success.setBackgroundResource(R.drawable.btn_circle2);
            Activity_RegistroHuella.btn_registrar.setEnabled(true);
            Activity_RegistroHuella.btn_registrar.setBackgroundResource(R.drawable.btn_generico);
  /*          Intent intent = new Intent(context, ActivityMotosRegistradas.class);
            context.startActivity(intent);
            ((Activity) context).finish();*/
        }
    }

    @Override
    public void onAuthenticationHelp(int helpMsgId, CharSequence helpString) {
    //    Toast.makeText(context, "Authentication help\n" + helpString, Toast.LENGTH_LONG).show();
    }


    @Override
    public void onAuthenticationSucceeded(
            FingerprintManager.AuthenticationResult result) {

        //Toast.makeText(context, "Success!", Toast.LENGTH_LONG).show();
        if(Constantes.flujo ==0) {
            Intent intent = new Intent(context, ActivityMotosRegistradas.class);
            context.startActivity(intent);
            ((Activity) context).finish();
        }
        else if(Constantes.flujo ==1){
            Activity_RegistroHuella.tv_registro.setText("! Registro Exitoso ¡");
            Activity_RegistroHuella.img_success.setImageResource(R.drawable.ic_accept_whilte);
            Activity_RegistroHuella.img_success.setBackgroundResource(R.drawable.btn_circle2);
            Activity_RegistroHuella.btn_registrar.setEnabled(true);
            Activity_RegistroHuella.btn_registrar.setBackgroundResource(R.drawable.btn_generico);
  /*          Intent intent = new Intent(context, ActivityMotosRegistradas.class);
            context.startActivity(intent);
            ((Activity) context).finish();*/
        }
    }


}
