package com.example.sharjeel.cleanit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Screen_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_2);
    }

    public void OnRegScreen2(View view) {
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }

    public void OnLogScreen2(View view) {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
}
