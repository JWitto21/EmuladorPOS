package com.example.nomasplastico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Clave extends AppCompatActivity {
    private TextView tv1;
    private EditText password;
    private String truePass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clave);

        String montostr = getIntent().getStringExtra("monto");
        truePass = getIntent().getStringExtra("password");
        password = (EditText) findViewById(R.id.pass);
        tv1 = (TextView) findViewById(R.id.monto_out);
        tv1.setText(montostr);
    }

    public void finalizar(View view) {
        String inPass = password.getText().toString();
        Intent i = new Intent(this, Final.class);
        if (truePass.equals(inPass)) {
            i.putExtra("resultado", "Transacción exitosa");
        } else {
            i.putExtra("resultado", "Transacción fallida");
        }
        startActivity(i);
    }


}
