package com.example.perezdepradae01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.vedruna.perezdepradae01.R;

public class MainActivity extends AppCompatActivity {

    private TextView textViewBienvenida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String userName = getIntent().getStringExtra("USERNAME");

        textViewBienvenida = findViewById(R.id.bienvenida);
        textViewBienvenida.setText("Bienvenido " + userName);
    }
}