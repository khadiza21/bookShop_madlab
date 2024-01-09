package com.example.testprojectmadlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class bookList extends AppCompatActivity {
Button back,   searchBar, buttonSeeDetails1, editTextSearch;
EditText edittextSearch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_list);


        back = (Button) findViewById(R.id.buttonBack);
        buttonSeeDetails1 = (Button) findViewById(R.id.buttonSeeDetails1);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Menu", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), nabberclick.class);
                startActivity(intent);
                Toast.makeText(bookList.this, "Redirecting..", Toast.LENGTH_SHORT).show();
            }
        });


        buttonSeeDetails1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Details", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), bookDetail.class);
                startActivity(intent);
                Toast.makeText(bookList.this, "Redirecting..", Toast.LENGTH_SHORT).show();
            }
        });
    }
}