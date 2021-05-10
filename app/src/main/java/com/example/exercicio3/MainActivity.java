package com.example.exercicio3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {

    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText nome = findViewById(R.id.nome);
        EditText sobrenome = findViewById(R.id.sobrenome);
        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = "Olá ";
                //text + nome.getText().toString()

                if(nome.getText().toString().equals("") && sobrenome.getText().toString().equals(""))
                    Toast.makeText(MainActivity.this, "Nome não inserido", LENGTH_SHORT).show();
                else
                {
                    if(sobrenome.getText().toString().equals(""))
                        Toast.makeText(MainActivity.this, text + nome.getText().toString(), LENGTH_SHORT).show();
                    else
                    if(nome.getText().toString().equals(""))
                        Toast.makeText(MainActivity.this, text + sobrenome.getText().toString(), LENGTH_SHORT).show();
                    else
                        Toast.makeText(MainActivity.this, text + nome.getText().toString() + " " + sobrenome.getText().toString(), LENGTH_SHORT).show();


                }


            }
        });
    }
}