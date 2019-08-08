package com.example.hackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btLogin, btCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btLogin = findViewById(R.id.btLogin);
        btCadastro = findViewById(R.id.btCadastro);

        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), Login.class);

                //Passagem de valor entre as telas
                i.putExtra("primeiro_valor", "Exemplo de texto");
                i.putExtra("segundo_valor", 200);

                startActivity(i);  //Comando para abrir a tela
            }
        });

        btCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), Cadastro.class);

                //Passagem de valor entre as telas
                i.putExtra("primeiro_valor", "Exemplo de texto");
                i.putExtra("segundo_valor", 200);

                startActivity(i);  //Comando para abrir a tela
            }
        });
    }
}
