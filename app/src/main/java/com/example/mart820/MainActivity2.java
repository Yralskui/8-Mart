package com.example.mart820;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    private EditText editTextAnswer;
    private Button buttonCheckAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editTextAnswer = findViewById(R.id.editTextAnswer);
        buttonCheckAnswer = findViewById(R.id.buttonCheckAnswer);

        buttonCheckAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer();
            }
        });
    }

    private void checkAnswer() {
        String answer = editTextAnswer.getText().toString().trim();

        // Проверка ответа (например, правильный ответ "42")
        if (answer.equals("20")) {
            // Если ответ правильный, переходим на SuccessActivity
            Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
            startActivity(intent);
        } else {
            // Здесь можно добавить обработку неправильного ответа, например, показать сообщение
            editTextAnswer.setError("Неправильный ответ. Попробуйте снова.");
        }
    }
}
