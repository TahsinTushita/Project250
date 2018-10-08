package com.example.tushita.project4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText et1,et2,et3,et4,et5;
    private TextView signupTextview;
    private Button signupButton,guestButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.username_id);
        et2 = (EditText) findViewById(R.id.phoneno_id);
        et3 = (EditText) findViewById(R.id.password_id);
        et4 = (EditText) findViewById(R.id.mailid_id);
        et5 = (EditText) findViewById(R.id.address_id);
        signupButton = (Button) findViewById(R.id.signup_button_id);
        guestButton = (Button) findViewById(R.id.guest_button_id);

        signupButton.setOnClickListener(this);
        guestButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.signup_button_id){
            Intent intent = new Intent(MainActivity.this,SignInActivity.class);
            startActivity(intent);
        }

        if(v.getId()==R.id.guest_button_id){
            Intent intent = new Intent(MainActivity.this,Guest_Activity_homepage.class);
            startActivity(intent);
        }
    }
}
