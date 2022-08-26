package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public EditText uname, pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uname = (EditText) findViewById(R.id.editTextTextPersonName);
        pass = (EditText) findViewById(R.id.editTextTextPassword);
    }

    public void validate(View view) {
        String password = pass.getText().toString();
        if (uname.length() == 0) {
            uname.setError("enter the username");
        }
        if (pass.length() == 0) {
            pass.setError("enter the password");
        }
        else if (pass.length() < 8) {
            pass.setError("enter password greater than 8 character");
        }
        else if (pass.length() > 15) {
            pass.setError("enter password less than 15 character");
        }
        else if (!password.matches("(.*[A-Z].*)")) {
            pass.setError("Password doesn't contain uppercase");
        }
        else if (!password.matches("(.*[a-z].*)")) {
            pass.setError("Password doesn't contain lowercase");
        }
        else if (!password.matches("^(?=.*[_.()$&@]).*$")) {
            pass.setError("Password doesn't contain special symbol");
        }
    }
}
