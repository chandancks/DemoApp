package com.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void changeImage(View view) {
        ImageView myImage = findViewById(R.id.myImageView);
        myImage.setImageResource(R.drawable.professor);
    }

    public void clickButton(View view) {
        EditText username = findViewById(R.id.usernameTextField);
        EditText password = findViewById(R.id.passwordTextField);
        Toast.makeText(MainActivity.this,"Hello! " + username.getText().toString(),Toast.LENGTH_LONG).show();
        Log.i("Username",username.getText().toString());
        Log.i("Password",password.getText().toString());
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}