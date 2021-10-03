package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
public static final String TAG="Mainactivity";
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        Toast.makeText(this, "onCreate from activity 1", Toast.LENGTH_SHORT).show();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(MainActivity.this,second.class);
                Student s=new Student();
                s.setCity("Ranchi");
                s.setName("Neeraj");
                s.setSchool_name("St Jhons");
                i.putExtra("Parcel",s);
                startActivity(i);
            }
        });
        Log.i(TAG,"onCreate");
    }
    @Override
    protected void onStart()
    {
        super.onStart();
        Log.i(TAG,"onStart");
        Toast.makeText(this, "Onstart run for 1 Activity", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume()
    {
        super.onResume();
        Log.i(TAG,"on resume");
        Toast.makeText(this, "Onresume run for 1 Activity", Toast.LENGTH_SHORT).show();


    }
    @Override
    protected void onPause()
    {
        super.onPause();
        Log.i(TAG,"on pause");
        Toast.makeText(this, "onPause run for 1 Activity", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop()
    {
        super.onStop();
        Log.i("TAG","on stop");
        Toast.makeText(this, "Onstop run for 1 Activity", Toast.LENGTH_SHORT).show();
    }
    @Override
        protected void onDestroy()
        {
            super.onDestroy();
            Log.i("TAG","on Destroy");
            Toast.makeText(this, "OnDestroy run for 1 Activity", Toast.LENGTH_SHORT).show();
        }
    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.i(TAG,"on Restart");
        Toast.makeText(this, "OnRestart run for 1 Activity", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Toast.makeText(this, "OnSaveInstanceStart on 1st Activity", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Toast.makeText(this, "OnRestoreInstanceState on 1st Activity", Toast.LENGTH_SHORT).show();
    }


}
