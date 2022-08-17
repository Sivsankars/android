package com.example.activitycycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifecycle","on create invoked");
    }
    public void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart invoked", Toast.LENGTH_SHORT).show();
        Log.d("lifecycle","onStart invoked");
    }
    public void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume invoked", Toast.LENGTH_SHORT).show();
        Log.d("lifecycle","onResume invoked");
    }
    public void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause invoked", Toast.LENGTH_SHORT).show();
        Log.d("lifecycle","onPause invoked");
    }
    public void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop invoked", Toast.LENGTH_SHORT).show();
        Log.d("lifecycle","onStop invoked");
    }
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy invoked", Toast.LENGTH_SHORT).show();
        Log.d("lifecycle","onDestroy invoked");
    }

}
