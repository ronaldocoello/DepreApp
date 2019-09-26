package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Funciones extends AppCompatActivity {

    Button  pacientes, tratamiento, estadisticas,citas,usuario,test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funciones);

        pacientes = (Button) findViewById(R.id.pacientes);
        estadisticas = (Button) findViewById(R.id.estadisticas);
        citas = (Button) findViewById(R.id.citas);
        usuario = (Button) findViewById(R.id.usuario);
        test = (Button) findViewById(R.id.test);



        pacientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Pacientes();
            }
        });

        estadisticas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Estadisiticas();
            }
        });
        citas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Citas();
            }
        });
        usuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Usuario();
            }
        });

        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Test();
            }
        });

    }
    public void Pacientes()
    {
        Intent intent = new Intent(this, Ver_pacientes.class );
        startActivity(intent);
    }


    public void Estadisiticas()
    {
        Intent intent = new Intent(this, Ver_estadisticas.class);
        startActivity(intent);
    }
    public void Citas()
    {
        Intent intent = new Intent(this,Ver_citas.class);
        startActivity(intent);

    }

    public void Usuario() {
        Intent intent = new Intent(this, Ver_Usuario.class);
        startActivity(intent);
    }
    public void Test()
    {
        Intent intent = new Intent(this, Tests.class);
        startActivity(intent);
    }
}
