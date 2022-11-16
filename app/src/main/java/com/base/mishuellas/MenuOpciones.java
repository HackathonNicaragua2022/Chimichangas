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

        Button create1 = findViewById(R.id.crear1);
        create1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), FichaPersona.class);
                startActivityForResult(intent,0);
            }
        });

        Button create2 = findViewById(R.id.crear2);
        create2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), FichaAnimales.class);
                startActivityForResult(intent,0);
            }
        });

    }
}