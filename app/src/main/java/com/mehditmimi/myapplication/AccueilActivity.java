package com.mehditmimi.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.mehditmimi.myapplication.models.User;

public class AccueilActivity extends AppCompatActivity {

    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);
        textView=findViewById(R.id.hello);
        Intent intent= getIntent();
        User user = (User) intent.getSerializableExtra("user");
        textView.setText(user.getName());
    }
}