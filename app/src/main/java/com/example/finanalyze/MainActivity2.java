package com.example.finanalyze;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class MainActivity2 extends AppCompatActivity {
    public void signUp(View view)
    {
        Intent signUpIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.finanalyze.in/accounts/sign_up"));
        startActivity(signUpIntent);
    }
    public void signIn(View view)
    {
        Intent signInIntent = new Intent(getApplicationContext(), SignIn.class);
        startActivity(signInIntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}