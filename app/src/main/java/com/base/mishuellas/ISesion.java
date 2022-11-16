package com.base.mishuellas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class ISesion extends AppCompatActivity {

    EditText email, password;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isesion);

        Button btnloggin = findViewById(R.id.loggin);


          btnloggin.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              String emailUser = email.getText().toString().trim();
              String passUser = password.getText().toString().trim();

              if (emailUser.isEmpty() && passUser.isEmpty()){
                  Toast.makeText(ISesion.this, "Ingrese los datos", Toast.LENGTH_SHORT).show();
              }
              else {
                  loginUser(emailUser, passUser);
              }

          }
      });

    }

    private void loginUser(String emailUser, String passUser) {
        mAuth.signInWithEmailAndPassword(emailUser, passUser).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    finish();
                    startActivity(new Intent(ISesion.this, MainActivity.class));
                    Toast.makeText(ISesion.this, "Bienvenido", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(ISesion.this, "Error", Toast.LENGTH_SHORT).show();
                }
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(ISesion.this, "Error al inciar sesión", Toast.LENGTH_SHORT).show();
            }
        });
    }

}