package com.example.testprojectmadlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
public class nabberclick extends AppCompatActivity {

   Button home, profile,about,contact,logout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nabberclick);

        home=(Button) findViewById(R.id.btnHome);
        profile=(Button) findViewById(R.id.btnProfile);
        about=(Button) findViewById(R.id.btnAbout);
        contact=(Button) findViewById(R.id.btnContact);
        logout=(Button) findViewById(R.id.btnlogout);



        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Home", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), homeP.class);
                startActivity(intent);
                Toast.makeText(nabberclick.this, "Redirecting..", Toast.LENGTH_SHORT).show();
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Profile", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), profile.class);
                startActivity(intent);
                Toast.makeText(nabberclick.this, "Redirecting..", Toast.LENGTH_SHORT).show();
            }
        });


        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "About", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), about.class);
                startActivity(intent);
                Toast.makeText(nabberclick.this, "Redirecting..", Toast.LENGTH_SHORT).show();
            }
        });


        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Contact US", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), contactUs.class);
                startActivity(intent);
                Toast.makeText(nabberclick.this, "Redirecting..", Toast.LENGTH_SHORT).show();
            }
        });


        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Sign Out", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                Toast.makeText(nabberclick.this, "Redirecting..", Toast.LENGTH_SHORT).show();
            }
        });

    }



}