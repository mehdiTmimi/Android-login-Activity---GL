package com.mehditmimi.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.mehditmimi.myapplication.actions.AuthentificationAction;
import com.mehditmimi.myapplication.business.Services;

public class MainActivity extends Activity {

    private Button loginButton;
    private Button facebookButton;
    private Button twitterButton;
    private EditText emailInput;
    private EditText passwordInput;
    private Services services;

    private static int indiceGlobal=1;
    private int indice;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        indice=indiceGlobal;
        indiceGlobal++;
        setContentView(R.layout.activity_main);
        services= ((MyContext)getApplicationContext()).getServices();
        //recuperation des views
        facebookButton=findViewById(R.id.button_facebook);
        twitterButton=findViewById(R.id.twitter_button);
        loginButton=findViewById(R.id.login_button);
        emailInput=findViewById(R.id.email_input);
        passwordInput=findViewById(R.id.password_input);

        facebookButton.setOnClickListener(view->{
            Intent intent= new Intent(this,MainActivity.class);
            startActivity(intent);
        });
        twitterButton.setOnClickListener(view->{
            finish();
        });

        AuthentificationAction authentificationAction=new AuthentificationAction(this);
        loginButton.setOnClickListener(authentificationAction);

        Log.i("Gl-2023", indice+"on create called");
    }

    public Services getServices() {
        return services;
    }

    public EditText getEmailInput() {
        return emailInput;
    }

    public EditText getPasswordInput() {
        return passwordInput;
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Gl-2023", indice+"on start called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Gl-2023", indice+"on resume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Gl-2023", indice+"on pause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Gl-2023", indice+"on stop called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Gl-2023", indice+"on restart called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Gl-2023", indice+"on destroy called");
    }
}
