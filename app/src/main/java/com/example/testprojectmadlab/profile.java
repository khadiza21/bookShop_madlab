package com.example.testprojectmadlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class profile extends AppCompatActivity {
    Button back;
    private ImageView imageViewProfile;
    private TextView textViewUsername, textViewEmail, textViewPhone, Gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        textViewUsername = findViewById(R.id.textViewUsername);
        textViewEmail =findViewById(R.id.textViewEmail);
        textViewPhone =findViewById(R.id.textViewPhone);
        Gender= findViewById(R.id.textViewGender);
        // Get a reference to your Firebase database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("siteUser"); // "items" is the path to your data
        // Read from the database
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again whenever data at this location is updated.
                siteUser item = dataSnapshot.getValue(siteUser.class);
                if (item != null) {
                    textViewUsername.setText("Name: " + siteUser.name());
                    textViewUsername.setText("Gender: " + siteUser.gender());
                    textViewUsername.setText("Email: " + siteUser.email());
                    textViewUsername.setText("Phone: " + siteUser.number());
                    textViewUsername.setText("Age: " + siteUser.age());
                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                // Failed to read value
                dataTextView.setText("Failed to load data");
            }
        });
        back = (Button) findViewById(R.id.buttonBack);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Menu", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), nabberclick.class);
                startActivity(intent);
                Toast.makeText(profile.this, "Redirecting..", Toast.LENGTH_SHORT).show();
            }
        });
    }
}