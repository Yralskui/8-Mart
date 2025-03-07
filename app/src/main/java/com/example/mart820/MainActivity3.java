package com.example.mart820;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    private TextView textView;
    private Handler handler;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        textView = findViewById(R.id.textView);
        handler = new Handler();

        // Задержка в 5 секунд (5000 миллисекунд)
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // Изменяем текст через 5 секунд
                textView.setText("аххахахаах ты бы видела себя\nкрутой пример а вообще с 8 марта");
            }
        }, 5000);

        Button buttonOpenActivity4 = findViewById(R.id.button2);
        buttonOpenActivity4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Создаем Intent для перехода на SecondActivity
                Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
                startActivity(intent);
            }
        });

    }
}