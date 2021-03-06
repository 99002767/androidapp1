package com.example.lntappactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName() ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onstart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onpause");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"onresume");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"onstop");

    }

    public void clickHandler(View view) {
        Log.e(TAG,"clickHandler");
        switch(view.getId()){
            case R.id.button:
                starthome();
                break;
            case R.id.button2:
                Intent nIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.ltts.com"));
                startActivity(nIntent);
                break;
        }

    }

    private void starthome() {
        Intent hIntent = new Intent(MainActivity.this, HomeActivity.class);
        hIntent.putExtra("mykey","mohith");
        int c = add(10,20);
        startActivity(hIntent);
    }

    private int add(int a, int b) {
        return a+b;
    }
}
