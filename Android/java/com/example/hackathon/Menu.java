package com.example.hackathon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Menu extends AppCompatActivity {

    EditText campo_id_Quiz;
    Button btEntrarQuiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btEntrarQuiz = findViewById(R.id.btEntrarQuiz);
        campo_id_Quiz = findViewById(R.id.campo_id_Quiz);

        ConstraintLayout constraintLayout = findViewById(R.id.layoutMenu);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

        btEntrarQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), Quiz.class);

                //Passagem de valor entre as telas
                i.putExtra("primeiro_valor", "Exemplo de texto");
                i.putExtra("segundo_valor", 200);

                startActivity(i);  //Comando para abrir a tela



            }
        });

    }
}
