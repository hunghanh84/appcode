package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    private TextView txtcanhan,txtcaidat;
    private ImageView imguser,imgsetting;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtcanhan=findViewById(R.id.txtcanhan);
        txtcaidat=findViewById(R.id.txtcaidat);

    }
}