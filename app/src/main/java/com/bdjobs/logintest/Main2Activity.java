package com.bdjobs.logintest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.login.LoginManager;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(this);



        setContentView(R.layout.activity_main2);
        Bundle inBundle = getIntent().getExtras();
        String name = inBundle.get("name").toString();
        String surname = inBundle.get("surname").toString();
        String imageUrl = inBundle.get("imageUrl").toString();
        Toast.makeText(Main2Activity.this,name, Toast.LENGTH_LONG).show();
    }

    public void logout(View view){
        LoginManager.getInstance().logOut();
        Intent login = new Intent(Main2Activity.this, MainActivity.class);
        startActivity(login);
        finish();
    }
}
