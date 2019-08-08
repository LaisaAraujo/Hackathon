package com.example.hackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class Cadastro extends AppCompatActivity {

    private Switch switchNotificacao;
    Button btCadastrar;
    private EditText campo_cadastro_usuario, campo_cadastro_senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        //Vincular cada objeto acima com o componente correspondente
        btCadastrar = findViewById(R.id.btCadastrar);
        campo_cadastro_usuario = findViewById(R.id.campo_login_usuario);
        campo_cadastro_senha = findViewById(R.id.campo_login_senha);

        btCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String usuario = campo_cadastro_usuario.getText().toString();
                String senha = campo_cadastro_senha.getText().toString();

                BancoDeDados banco = new BancoDeDados(getApplicationContext(), 1);

                if(banco.cadastrarUsuario(usuario, senha)){
                    Toast.makeText(getApplicationContext(),
                            "Dados cadastrados!", Toast.LENGTH_LONG).show();


                    //Utilização da classe intent para abrir uma nova tela/Activity
                    //getApplicationContext() -> indica que será aberto um recurso loca, ou seja, do próprio aplicativo
                    Intent i = new Intent(getApplicationContext(), Login.class);

                    //Passagem de valor entre as telas
                    i.putExtra("primeiro_valor", "Exemplo de texto");
                    i.putExtra("segundo_valor", 200);

                    startActivity(i);  //Comando para abrir a tela





                }else{
                    Toast.makeText(getApplicationContext(),
                            "Não cadastrado!", Toast.LENGTH_LONG).show();
                }






            }
        });




    }
}