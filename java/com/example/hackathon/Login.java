package com.example.hackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    Button btLogar;
    private EditText campo_login_usuario, campo_login_senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btLogar = findViewById(R.id.btLogar);
        campo_login_usuario = findViewById(R.id.campo_login_usuario);
        campo_login_senha = findViewById(R.id.campo_login_senha);


        btLogar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                String usuario = campo_login_usuario.getText().toString();
                String senha = campo_login_senha.getText().toString();

                BancoDeDados bancoDeDados = new BancoDeDados(getApplicationContext(),1);
                if (bancoDeDados.validaAcessa(usuario,senha)) {
                    Toast.makeText(getApplicationContext(), "Acesso Liberado", Toast.LENGTH_LONG).show();
                    //Utilização da classe intent para abrir uma nova tela/Activity
                    //getApplicationContext() -> indica que será aberto um recurso loca, ou seja, do próprio aplicativo
                    Intent i = new Intent(getApplicationContext(), Menu.class);

                    //Passagem de valor entre as telas
                    i.putExtra("primeiro_valor", "Exemplo de texto");
                    i.putExtra("segundo_valor", 200);

                    startActivity(i);  //Comando para abrir a tela
                }
                else
                    Toast.makeText(getApplicationContext(),"Dados Invalidos", Toast.LENGTH_LONG).show();

            }
        });





    }
}

