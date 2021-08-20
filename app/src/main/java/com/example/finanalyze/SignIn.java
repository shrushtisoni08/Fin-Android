package com.example.finanalyze;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignIn extends AppCompatActivity {
    EditText userName;
    EditText password;
    Button button;
    public void signIn(View view)
    {
        userName = (EditText) findViewById(R.id.userName);
        password = (EditText) findViewById(R.id.password);
        Log.i("Username",userName.getText().toString());
        Log.i("Password",password.getText().toString());
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }
}