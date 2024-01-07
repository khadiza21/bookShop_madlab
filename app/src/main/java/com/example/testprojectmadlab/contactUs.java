package com.example.testprojectmadlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class contactUs extends AppCompatActivity {


Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
        back=(Button) findViewById(R.id.buttonBack);




        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Menu", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), nabberclick.class);
                startActivity(intent);
                Toast.makeText(contactUs.this, "Redirecting..", Toast.LENGTH_SHORT).show();
            }
        });
    }
}