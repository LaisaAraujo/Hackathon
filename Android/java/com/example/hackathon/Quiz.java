package com.example.hackathon;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;



public class Quiz extends AppCompatActivity {

        public Button next;
        public TextView pontos,pergunta;
        public RadioButton opcao1, opcao2, opcao3, opcao4;
        public RadioGroup grupo;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_quiz);

            next = findViewById(R.id.next); //Botão
            pontos = findViewById(R.id.pontos);
            pergunta = findViewById(R.id.pergunta);

            //Alternativas
            grupo = findViewById(R.id.grupo);
            opcao1 = findViewById(R.id.opcao1);
            opcao2 = findViewById(R.id.opcao2);
            opcao3 = findViewById(R.id.opcao3);
            opcao4 = findViewById(R.id.opcao4);



            //Ação para mudar a pergunta e as cores das alternativas
            next.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    String resp = "recortar e alternar entre janelas.";
                    int id = grupo.getCheckedRadioButtonId();

                    if (id > 0) {


                        if (resp.equals(opcao1.getText().toString())) {
                            opcao1.setBackgroundTintList(getResources().getColorStateList(R.color.verdadeiro));
                            opcao1.setTextColor(getResources().getColorStateList(R.color.corBonitona));

                        } else {
                            opcao1.setBackgroundTintList(getResources().getColorStateList(R.color.falso));
                            opcao1.setTextColor(getResources().getColorStateList(R.color.corBonitona));
                        }

                        if (resp.equals(opcao2.getText().toString())) {
                            opcao2.setBackgroundTintList(getResources().getColorStateList(R.color.verdadeiro));
                            opcao2.setTextColor(getResources().getColorStateList(R.color.corBonitona));
                        } else {
                            opcao2.setBackgroundTintList(getResources().getColorStateList(R.color.falso));
                            opcao2.setTextColor(getResources().getColorStateList(R.color.corBonitona));
                        }

                        if (resp.equals(opcao3.getText().toString())) {
                            opcao3.setBackgroundTintList(getResources().getColorStateList(R.color.verdadeiro));
                            opcao3.setTextColor(getResources().getColorStateList(R.color.corBonitona));
                        } else {
                            opcao3.setBackgroundTintList(getResources().getColorStateList(R.color.falso));
                            opcao3.setTextColor(getResources().getColorStateList(R.color.corBonitona));
                        }

                        if (resp.equals(opcao4.getText().toString())) {
                            opcao4.setBackgroundTintList(getResources().getColorStateList(R.color.verdadeiro));
                            opcao4.setTextColor(getResources().getColorStateList(R.color.corBonitona));
                        } else {
                            opcao4.setBackgroundTintList(getResources().getColorStateList(R.color.falso));
                            opcao4.setTextColor(getResources().getColorStateList(R.color.corBonitona));
                        }


                    } else {
                        Toast.makeText(getApplicationContext(), "Selecione uma opção", Toast.LENGTH_LONG).show();
                    }


                }
            });
        }





        //MÉTODO IMPORTANTE
        public void onRadioButtonClicked (View view){

            boolean checked = ((RadioButton) view).isChecked();

            switch (view.getId()) {
                case R.id.opcao1:
                    if (checked)
                        break;
                case R.id.opcao2:
                    if (checked)

                        break;

                case R.id.opcao3:
                    if (checked)

                        break;

                case R.id.opcao4:
                    if (checked)

                        break;
            }

        }
    }
