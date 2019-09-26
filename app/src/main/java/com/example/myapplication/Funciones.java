package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.nio.channels.InterruptedByTimeoutException;

public class Funciones extends AppCompatActivity {

    Button  pacientes, tratamiento, estadisticas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funciones);

        pacientes = (Button) findViewById(R.id.pacientes);
        tratamiento = (Button) findViewById(R.id.tratamiento);
        estadisticas = (Button) findViewById(R.id.estadisticas);

        pacientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Pacientes();
            }
        });

        tratamiento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Tratamiento();
            }
        });
        estadisticas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Estadisiticas();
            }
        });

    }
    public void Pacientes()
    {
        Intent intent = new Intent(this, Ver_pacientes.class );
        startActivity(intent);
    }

    public void Tratamiento()
    {
        Intent intent = new Intent(this, Ver_Tratamiento.class);
        startActivity(intent);
    }
    public void Estadisiticas()
    {
        Intent intent = new Intent(this, Ver_estadisticas.class);
        startActivity(intent);
    }
}
