package com.example.pdd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class Test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }

    public void ot1(View view) {
        view.setBackgroundColor(Color.parseColor("#FF1010"));
        Toast myToast = Toast.makeText(getApplicationContext(),
                "Ответ неверный", Toast.LENGTH_LONG);
        myToast.show();
        myToast.setGravity(Gravity.BOTTOM,0,0);
    }

    public void ot2(View view) {
        view.setBackgroundColor(Color.parseColor("#FF1010"));
        Toast myToast = Toast.makeText(getApplicationContext(),
                "Ответ неверный", Toast.LENGTH_LONG);
        myToast.show();
        myToast.setGravity(Gravity.BOTTOM,0,0);
    }

    public void ot3(View view) {
        view.setBackgroundColor(Color.parseColor("#70C041"));
        Intent intent = new Intent(Test.this, Congratulation.class);
        startActivity(intent);
    }

    public void ot4(View view) {
        view.setBackgroundColor(Color.parseColor("#FF1010"));
        Toast myToast = Toast.makeText(getApplicationContext(),
                "Ответ неверный", Toast.LENGTH_LONG);
        myToast.show();
        myToast.setGravity(Gravity.BOTTOM,0,0);
    }
}