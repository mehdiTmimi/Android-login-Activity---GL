package com.mehditmimi.myapplication.actions;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.mehditmimi.myapplication.AccueilActivity;
import com.mehditmimi.myapplication.MainActivity;
import com.mehditmimi.myapplication.models.User;

public class AuthentificationAction implements View.OnClickListener{

   private MainActivity mainActivity;

   private EditText emailInput;
   private EditText passwordInput;
   public AuthentificationAction(MainActivity mainActivity){
       this.mainActivity=mainActivity;
       emailInput=mainActivity.getEmailInput();
       passwordInput=mainActivity.getPasswordInput();
   }

    @Override
    public void onClick(View view) {
        // verification
     if(emailInput.getText().toString().equals("") || passwordInput.getText().toString().equals("")) {
         Toast.makeText(mainActivity, "all fields are required",
                 Toast.LENGTH_SHORT).show();
         return;
     }
     // authentification
       User user= mainActivity.getServices().login(emailInput.getText().toString()
                ,passwordInput.getText().toString());
     if(user!=null)
     {
         Intent intent= new Intent(mainActivity, AccueilActivity.class);
         intent.putExtra("user",user);
         mainActivity.startActivity(intent);
         mainActivity.finish();
     }
        // Toast.makeText(mainActivity, "Hi"+user.getName(), Toast.LENGTH_SHORT).show();
     else
         Toast.makeText(mainActivity, "error", Toast.LENGTH_SHORT).show();
    }
}
