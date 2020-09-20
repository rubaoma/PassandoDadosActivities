package com.example.passandodadosactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonEnviar;
    private int idade = 40;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonEnviar = findViewById(R.id.buttonEnviar);

        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), SegundaActivity.class);

                //instanciar o objeto
                Usuario usuario = new Usuario("Rubens","rubens@gmail.com");


                //passar dados
                intent.putExtra("nome", "Rubens");
                intent.putExtra("idade", idade);
                intent.putExtra("objeto", usuario);

                startActivity(intent);

            }
        });
    }
}