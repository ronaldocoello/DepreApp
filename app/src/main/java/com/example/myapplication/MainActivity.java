package com.example.myapplication;


import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

  Button btoingresar,btoregistrar;
  EditText Nom,Contraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btoingresar = (Button) findViewById(R.id.btoingresar);
        btoregistrar= (Button) findViewById(R.id.btoregistrar);

        Nom = (EditText) findViewById(R.id.Nom);
        Contraseña = (EditText) findViewById(R.id.Contraseña);


        btoingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                funciones(Nom.getText().toString(), Contraseña.getText().toString());
            }
        });

        btoregistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registrar();
            }
        });

    }
    public void funciones(String usuario, String contraseña)
    {
        if((usuario.equals("ronaldo")) && (contraseña.equals("1234")))
        {
            Intent intent = new Intent(this, Funciones.class);
            startActivity(intent);

        }
        else if ((usuario.equals("")) && ((contraseña.equals("")))){


            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

            builder.setIcon(R.mipmap.ic_launcher).
                    setTitle("ADVERTENCIA").
                    setMessage("Debes escribir usuario y contraseña para poder ingresar.");

            AlertDialog alertDialog = builder.create();
            alertDialog.show();

        }

    }

    public void registrar()
    {
        Intent intent = new Intent(this, Registro.class);
        startActivity(intent);

    }



}
