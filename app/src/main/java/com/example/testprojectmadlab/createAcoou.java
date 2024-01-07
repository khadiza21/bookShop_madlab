package com.example.testprojectmadlab;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class createAcoou extends AppCompatActivity {

    private EditText editTextUsername, editTextEmail, editTextNumber, editTextPassword;
    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private Button buttonSignUp;
    private TextView textSignIn;
    ProgressBar progressBar;

    private FirebaseAuth mAuth;


    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser != null){
            Intent intent = new Intent(getApplicationContext(), homeP.class);
            startActivity(intent);
            finish();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_acoou);
        mAuth = FirebaseAuth.getInstance();
        editTextUsername = findViewById(R.id.editTextUsername);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextNumber = findViewById(R.id.editTextNumber);
        editTextPassword = findViewById(R.id.editTextPassword);
        radioGroup = findViewById(R.id.radioGroup);
        buttonSignUp = findViewById(R.id.buttonSignUp);
        textSignIn = findViewById(R.id.textSignIn);
        progressBar = findViewById(R.id.progressBar);

        textSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), logIn.class);
                startActivity(intent);
                finish();
            }
        });

        buttonSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                registerUser();
            }
        });


    }


    private void registerUser() {
        progressBar.setVisibility((View.VISIBLE));
        String email = String.valueOf(editTextEmail.getText());
        String password = String.valueOf(editTextPassword.getText());

        if (TextUtils.isEmpty(email)) {

            Toast.makeText(createAcoou.this, "Enter email", Toast.LENGTH_SHORT).show();
            return;
        }

        if (TextUtils.isEmpty(password)) {
            Toast.makeText(createAcoou.this, "Enter Password", Toast.LENGTH_SHORT).show();
            return;
        }

        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        progressBar.setVisibility(View.GONE);
                        if (task.isSuccessful()) {
                            FirebaseUser user = mAuth.getCurrentUser();
                            Toast.makeText(createAcoou.this, "Registration successful!", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(getApplicationContext(), homeP.class);
                            startActivity(intent);
                            finish();
                        } else {

                            Toast.makeText(createAcoou.this, "Registration failed.",
                                    Toast.LENGTH_SHORT).show();

                        }
                    }
                });

    }
}