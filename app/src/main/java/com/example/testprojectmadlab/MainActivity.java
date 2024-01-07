package com.example.testprojectmadlab;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnContinue,exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnContinue=(Button) findViewById(R.id.buttonContinue);
        exit=(Button) findViewById(R.id.buttonExit);
        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Welcome", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), createAcoou.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Redirecting..", Toast.LENGTH_SHORT).show();
            }
        });


        exit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);

            }
        });

    }
}