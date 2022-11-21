package com.example.pdd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Congratulation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_congratulation);
    }

    public void prog(View view) {
        Intent intent;
        intent = new Intent(Congratulation.this, AboutTheProgram.class);
        startActivity(intent);

    }
}