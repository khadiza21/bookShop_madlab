package com.example.testprojectmadlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class bookDetail extends AppCompatActivity {
    Button cart, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_detail);

        back = (Button) findViewById(R.id.buttonBack);
        cart = (Button) findViewById(R.id.buttonAddToCart);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Menu", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), nabberclick.class);
                startActivity(intent);
                Toast.makeText(bookDetail.this, "Redirecting..", Toast.LENGTH_SHORT).show();
            }
        });


        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "add cart", Toast.LENGTH_SHORT).show();

            }
        });
    }
}