package com.base.mishuellas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pprincipal);

        Button iniciar = findViewById(R.id.button);
        iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PPrincipal.this, ISesion.class);
                startActivity(intent);
            }
        });

        Button iniciar2 = findViewById(R.id.button2);
        iniciar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PPrincipal.this, ISesion.class);
                startActivity(intent);
            }
        });

    }
}