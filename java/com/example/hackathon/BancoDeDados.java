package com.example.hackathon;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BancoDeDados extends SQLiteOpenHelper {

    private final String criaTabela = "CREATE TABLE  usuarios ("

            +   "usuario    VARCHAR (20) PRIMARY KEY,   "
            +   "senha      VARCHAR (40) NOT NULL );    ";


    public BancoDeDados(Context context, int version) {
        super(context, "BANCO_APLICATIVO", null, version);
    }

    @Override
    public void onOpen(SQLiteDatabase db) {
        super.onOpen(db);
        //Comando serve para habilitar chava estrangeira
        db.execSQL("PRAGMA foreign_keys = ON;");
    }

    //Método para cadastrar um usuario


    public boolean cadastrarUsuario(String usuario, String senha){

        //abrir conexão com o banco de dados
        SQLiteDatabase banco = getWritableDatabase();

        //passagem de valor para cada coluna da tabela

        ContentValues valores = new ContentValues();


        valores.put("usuario", usuario);    //Coluna da tabela, valor a ser atribuido

        valores.put("senha", senha);        //Coluna da tabela, valor a ser atribuido

        //Executando o comando INSERT na tabela

        if (banco.insert("usuarios","null", valores) != -1){
            banco.close();  //Fecha a conexão
            return true;

        }else{
            banco.close();  //Fecha conexão
            return false;
        }
    }

    public boolean validaAcessa(String usuario, String senha){
        SQLiteDatabase banco = getWritableDatabase(); //Abre a conexão

        //Utilização do objeto Cursos para armazenar o contéudo do SELECT
        Cursor c = banco.rawQuery(
                "SELECT senha FROM usuarios WHERE usuario=?", new String[]{usuario});

        //Verifcar se o Cursor tem algo dentro, isto é, se o SELECT encontrou algo
        if(c.moveToFirst()) {
            do {
                //Comparar a senha digitada com a senha do banco de dados


                if (senha.equals(c.getString(0))) {
                    banco.close();
                    return true;
                }
            } while (c.moveToNext());
        }
        //Caso não encontrou nada
        banco.close();
        return false;

    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(criaTabela);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}