package com.example.funcionalidades;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class Internet extends AppCompatActivity {

    private Button buttonVoltar;
    private Button buttonAtualizar;
    private TextView statusConexao;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internet);

        statusConexao = findViewById(R.id.statusConexao);

        buttonVoltar = findViewById(R.id.btnVoltar2);
        buttonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        buttonAtualizar = findViewById(R.id.buttonTestarInternet);
        buttonAtualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new InternetStatus(new InternetStatus.Consumer() {
                    @Override
                    public boolean accept(Boolean internet) {
                        if (internet) {
                            statusConexao.setText("Internet ok!");
                            return true;
                        } else {
                            statusConexao.setText("Desconectado!");
                            return false;
                        }
                    }
                });
            }
        });



    }
}
