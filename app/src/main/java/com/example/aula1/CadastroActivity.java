package com.example.aula1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        setTitle("Cadastro");

        //pegando os componentes do xml e trazendo para o java para manipular

        final EditText nomeEditText = findViewById(R.id.cadastro_nome);
        final EditText emailEditText = findViewById(R.id.cadastro_email);
        final EditText notaEditText = findViewById(R.id.cadastro_nota);
        Button enviarButton = findViewById(R.id.cadastro_enviar);

        //exibição de mensagem Toast no clique do botao
        enviarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(CadastroActivity.this, nomeEditText.getText(), Toast.LENGTH_SHORT).show();
                //objeto vira texto, que vira string
                String nome = nomeEditText.getText().toString();
                String email = emailEditText.getText().toString();
                String nota = notaEditText.getText().toString();
                //criando uma intenção, declarando onde a gente está, para onde queremos ir
                Intent intentFicha = new Intent(CadastroActivity.this, FichaActivity.class);
                //passando as infos para a intenção, do que irão para a outra Activity
                intentFicha.putExtra("extra_nome", nome);
                intentFicha.putExtra("extra_email", email);
                intentFicha.putExtra("extra_nota", nota);

                startActivity(intentFicha);

            }
        });

    }
}
