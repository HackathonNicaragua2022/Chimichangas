package com.base.mishuellas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.base.mishuellas.ui.login.LoginActivity;

public class MenuOpciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_opciones);

        Button iniciar = findViewById(R.id.button);
        iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), LoginActivity.class);
                startActivityForResult(intent,0);
            }
        });

        Button iniciar2 = findViewById(R.id.button2);
        iniciar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), LoginActivity.class);
                startActivityForResult(intent,0);
            }
        });

        Button mascotas = findViewById(R.id.button);
        mascotas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), LoginActivity.class);
                startActivityForResult(intent,0);
            }
        });

        Button personas = findViewById(R.id.button2);
        personas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), LoginActivity.class);
                startActivityForResult(intent,0);
            }
        });

        Button reportar = findViewById(R.id.button2);
        reportar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), LoginActivity.class);
                startActivityForResult(intent,0);
            }
        });

    }
}