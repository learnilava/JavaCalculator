package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.first:
                Toast.makeText(this, "Pressed", Toast.LENGTH_LONG).show();
            default:
                buttonFilter(0);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button first = findViewById(R.id.first);
        first.setOnClickListener(this);
    }

    public void buttonFilter(int tag){

    }
}