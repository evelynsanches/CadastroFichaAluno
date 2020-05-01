package com.example.aula1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FichaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ficha);
        setTitle("Ficha");

        //pegando os componentes do xml e trazendo ao java para manipular

        TextView nomeTextView = findViewById(R.id.ficha_nome);
        TextView emailTextView = findViewById(R.id.ficha_email);
        TextView notaTextView = findViewById(R.id.ficha_nota);

        //pegando as infos da intenção da outra activity

        String nome = getIntent().getStringExtra("extra_nome");
        String email = getIntent().getStringExtra("extra_email");
        String nota = getIntent().getStringExtra("extra_nota");

        nomeTextView.setText(nome);
        emailTextView.setText(email);
        notaTextView.setText(nota);




    }
}
