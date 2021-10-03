package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class second extends AppCompatActivity {
    private Button b;
    public static final String TAG="SecondActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        b=findViewById(R.id.button);

        Student student=(Student)getIntent().getParcelableExtra("Parcel");
        b.setText(student.getCity());

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent i=new Intent(second.this,thrid.class);
                startActivity(i);

                
            }
        });
        Log.i(TAG,"on Create method");
        Toast.makeText(this, "OnCreate on 2nd Activity", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"On start method");
        Toast.makeText(this, "OnStart on 2nd Activity", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume()
    {
        super.onResume();
        Log.i(TAG,"on resume");
        Toast.makeText(this, "OnResume on 2nd Activity", Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onPause()
    {
        super.onPause();
        Log.i(TAG,"on pause");
        Toast.makeText(this, "OnPause on 2nd Activity", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop()
    {
        super.onStop();
        Log.i("TAG","on stop");
        Toast.makeText(this, "OnStop on 2nd Activity", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.i("TAG","on Destroy");
        Toast.makeText(this, "OnDestroy on 2nd Activity", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.i(TAG,"on Restart");
        Toast.makeText(this, "OnRestart on 2nd Activity", Toast.LENGTH_SHORT).show();

    }


}
