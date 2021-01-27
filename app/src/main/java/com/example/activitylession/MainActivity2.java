package com.example.activitylession;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {
    String Tag = "Main Activity2";
    static int RESULT_CODE = 100;
    static int REQUEST_CODE = 123;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d(Tag,"onCreate");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(Tag,"onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(Tag,"onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(Tag,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(Tag,"onPause");
    }
    public  void onClick(View view)
    {
        Intent intent = new Intent();
        intent.putExtra("result",123);
        setResult(RESULT_CODE,intent);
        finish();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(Tag,"onStop");
    }
}