package com.cooking.info.cooking.Activities;

import android.content.Intent;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.cooking.info.cooking.R;

public class Login extends AppCompatActivity {

    private EditText username,password;
    private Button signin,signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.txtUserName);
        password = (EditText) findViewById(R.id.txtPassword);
        signin = (Button) findViewById(R.id.btnSignIn);
        signup = (Button) findViewById(R.id.btnSignUp);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( username.getText().length() == 0)
                {
                    Toast.makeText(Login.this,"Pleas enter username",Toast.LENGTH_LONG).show();
                    return;
                }
                if( password.getText().length() == 0)
                {
                    Toast.makeText(Login.this,"Pleas enter password",Toast.LENGTH_LONG).show();
                    return;
                }

                Intent myIntent = new Intent(Login.this, ChatActivity.class);
                Login.this.startActivity(myIntent);
                Login.this.finish();
            }
        });
    }
}
