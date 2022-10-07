package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView m1,m2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m1=findViewById(R.id.imageView);
        m2=findViewById(R.id.imageView2);
        m1.setOnClickListener(this :: Onclick);
        m2.setOnClickListener(this :: Onclick);
    }
    private void Onclick(View view){
        if(view.getId()==R.id.imageView2){
            m2.setVisibility(view.GONE);
            m1.setVisibility(view.VISIBLE);
        }
        else{
            m1.setVisibility(view.GONE);
            m2.setVisibility(view.VISIBLE);
        }
    }
}
