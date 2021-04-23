package com.example.mensagem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MostraMensagemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostra_mensagem)

        val mensagem = intent.getStringExtra(MainActivity.INFO_EXTRA_MENSAGEM)
        //Todo: Obter a data e a hora
        val dataHora = intent.getStringExtra(MainActivity.DATA_HORA)

        val textViewMensagem = findViewById<TextView>(R.id.textViewMensagem)
        textViewMensagem.text = mensagem
        //Todo: Mostra a data e a hora
        val textViewDataHora = findViewById<TextView>(R.id.textViewDataHora)
        textViewDataHora.text = dataHora

    }
}