package com.example.meuapp;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.sql.SQLDataException;

public class MainActivity extends AppCompatActivity {


    SQLiteDatabase sqLiteDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        sqLiteDatabase = openOrCreateDatabase("notas",MODE_PRIVATE, null);
        sqLiteDatabase.execSQL("CREATE TABLE  IF NOT EXISTS notas (id INTEGER PRIMARY KEY AUTOINCREMENT, titulo TEXT, nota TEXT)");

        //String titulo="João";
        //sqLiteDatabase.execSQL("INSERT INTO notas VALUES(1,"+titulo+",'')");


        ContentValues contentValues=new ContentValues();
        contentValues.put("titulo","joão");
        contentValues.put("nota", "777");
        sqLiteDatabase.insert("notas", null,contentValues);


        /// recuperar dados
        sqLiteDatabase.rawQuery();

    }
}