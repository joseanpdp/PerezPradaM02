package com.example.perezdepradae01;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.vedruna.perezdepradae01.R;

public class LoginActivity extends AppCompatActivity {

    private EditText userName, userPassword;
    private Button buttonLogin;
    private TextView textViewError;

    private static final String USERNAME = "admin";
    private static final String PASSWORD = "admin";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userName = findViewById(R.id.userName);
        userPassword = findViewById(R.id.userPassword);
        buttonLogin = findViewById(R.id.loginButton);
        textViewError = findViewById(R.id.errorText);

        buttonLogin.setOnClickListener( (View v) -> {
            String username = userName.getText().toString();
            String password = userPassword.getText().toString();

            if (username.equals(USERNAME) && password.equals(PASSWORD)) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                intent.putExtra("USERNAME", username);
                startActivity(intent);
            } else {
                textViewError.setText("Nombre o contraseña erróneos");
            }
        });

    }
}