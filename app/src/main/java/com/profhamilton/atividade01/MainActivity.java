package com.profhamilton.atividade01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void irParaOutraTela (View view){
        EditText mensagemEditText = findViewById(R.id.editTextTextPassword);
        String mensagem = mensagemEditText.getText().toString();
        Intent intent = new Intent (this, ExibeMensagemActivity.class);
        intent.putExtra("Nome", mensagem);
        startActivity(intent);
    }
}