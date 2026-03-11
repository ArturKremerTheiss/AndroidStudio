package com.example.meuapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int contador=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        TextView tv = findViewById(R.id.tv);
        Button b = findViewById(R.id.button);
        b.setOnClickListener(v -> {
          contador++;

            Random random=new Random();
            int r = random.nextInt(100);

            tv.setText(Integer.toString(r));

      });


    }
}