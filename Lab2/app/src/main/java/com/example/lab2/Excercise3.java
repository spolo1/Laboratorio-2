package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Excercise3 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_excercise3);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, Excercise4.class);
        startActivity(intent);
    }
}