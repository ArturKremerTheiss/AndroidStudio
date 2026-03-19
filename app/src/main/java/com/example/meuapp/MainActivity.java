package com.example.meuapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int contador=0;
    TextView textView;
    EditText edmin,edmax;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        TextView tv = findViewById(R.id.tv);
        edmin=findViewById(R.id.edmin);
        edmax=findViewById(R.id.edmax);

        Button b = findViewById(R.id.button);
        b.setOnClickListener(v -> {
           // int min = Integer.parseInt( edmin.getText().toString());
          contador++;

          String minStr=edmin.getText().toString();
          String maxStr=edmax.getText().toString();
          if(minStr.isEmpty()){
              edmin.setError("Informe o valor minimo");
              return;
          }
          if(maxStr.isEmpty()){
              edmax.setError("Informe o valor maximo");
            edmin.requestFocus();
            return;
          }

          int min=Integer.parseInt((minStr));
          int max=Integer.parseInt(maxStr);


            Random random=new Random();
            int r = random.nextInt(min,max);
            textView.setText(Integer.toString(r));

            textView.setText(Integer.toString(r));

      });


    }
}