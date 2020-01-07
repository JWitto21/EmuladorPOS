package com.example.nomasplastico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText monto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        monto = (EditText) findViewById(R.id.monto_input);
    }

    public void aceptar(View view){
        Intent i = new Intent(this, Espera.class);
        i.putExtra("monto", monto.getText().toString());
        startActivity(i);
    }
}
