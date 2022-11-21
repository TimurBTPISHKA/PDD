package com.example.pdd;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

public class AboutTheProgram extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_the_program);
    }

    public void exit(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(AboutTheProgram.this);
        builder.setTitle("Выход из приложения")
                .setMessage("Вы уверены, что хотите закрыть приложение?")
                .setPositiveButton("ОК",
                        new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialog, int id){
                                finishAffinity();
                            }
                        })
                .setNegativeButton("Отмена",
                        new DialogInterface.OnClickListener(){
                            public void onClick(DialogInterface dialog,int id){
                                dialog.cancel();
                            }
                        });
        AlertDialog alert = builder.create();
        alert.show();
    }
}