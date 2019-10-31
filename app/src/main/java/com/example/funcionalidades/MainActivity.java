package com.example.funcionalidades;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.funcionalidades.Room.RoomActivity;

public class MainActivity extends AppCompatActivity {

    private Button buttonGps;
    private Button buttonInternet;
    private Button buttonCamera;
    private Button buttonPersistence;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonGps = findViewById(R.id.buttonGps);
        buttonGps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),GPS.class);
                startActivity(intent);
            }
        });

        buttonInternet = findViewById(R.id.buttonTestarConexao);
        buttonInternet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Internet.class);
                startActivity(intent);
            }
        });

        buttonCamera = findViewById(R.id.buttonCamera);
        buttonCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Camera.class);
                startActivity(intent);
            }
        });

        buttonPersistence = findViewById(R.id.buttonPersistencia);
        buttonPersistence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), RoomActivity.class);
                startActivity(intent);
            }
        });
    }

}
