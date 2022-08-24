package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public EditText fname,lname,email,phno,adress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fname=(EditText) findViewById(R.id.editTextTextPersonName);
        lname=(EditText) findViewById(R.id.editTextTextPersonName2);
        email=(EditText) findViewById(R.id.editTextTextEmailAddress2);
        phno=(EditText) findViewById(R.id.editTextPhone);
        adress=(EditText) findViewById(R.id.editTextTextPostalAddress);
    }
    public void check(View view){
        if(fname.length()==0){
            fname.setError("first name required");
        }
        if(lname.length()==0){
            lname.setError("last name required");

        }
        if(email.length()==0){
            email.setError("email required");

        }
        if(phno.length()==0){
            phno.setError("phone number required");

        }
        if(adress.length()==0){
            adress.setError("Address required");

        }


    }
}
