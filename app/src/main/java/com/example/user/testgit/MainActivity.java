package com.example.user.testgit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate()");
        showToast();
        showToast();
        showToast();
    }

    private void showToast(){
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
    }
}
