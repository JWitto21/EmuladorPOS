package com.example.nomasplastico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Final extends AppCompatActivity {
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        String resultado = getIntent().getStringExtra("resultado");
        tv1 = (TextView) findViewById(R.id.tvresultado);
        tv1.setText( resultado );
    }

    public void reinicio(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
