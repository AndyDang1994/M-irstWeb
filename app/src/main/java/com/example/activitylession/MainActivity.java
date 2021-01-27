package com.example.activitylession;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String Tag = "Main Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(Tag,"onCreateed");
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

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(Tag,"onStop");
    }
    public void onClick(View view)
    {
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        //startActivity(intent);
        startActivityForResult(intent,MainActivity2.REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == MainActivity2.REQUEST_CODE)
        {
            if(resultCode == MainActivity2.RESULT_CODE)
            {
                int result = data.getIntExtra("result",0);
                ((TextView)findViewById(R.id.textview)).setText(Integer.toString(result));
            }
        }
    }
}