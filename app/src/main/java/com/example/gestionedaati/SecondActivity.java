package com.example.gestionedaati;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity
{

    private static final String TAG= SecondActivity.class.getSimpleName();

    TextView listaBrani;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.d(TAG, "Dentro il metodo onCreate");

        listaBrani= findViewById(R.id.listaBrani);

        String lb= getIntent().getStringExtra("listaBrani");

        listaBrani.setText(lb);

    }
}