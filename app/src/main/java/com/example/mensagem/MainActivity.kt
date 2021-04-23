package com.example.mensagem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun enviaMensagem(View: View){
        val editTextMensagem = findViewById<EditText>(R.id.editTextMensagem)
        val mensagem = editTextMensagem.text.toString()

        if (mensagem.isBlank()){
            editTextMensagem.error = getString(R.string.mensagem_vazia)
            return
        }

        //Todo: Obter a data e a hora do sistema
        val dataHora = Calendar.getInstance().time.toString()


        val intent = Intent(this, MostraMensagemActivity::class.java)
        intent.putExtra(INFO_EXTRA_MENSAGEM, mensagem)
        //Todo: Passar a informação Data/Hora para a atividade mostraMensgaem
        intent.putExtra(Companion.DATA_HORA, dataHora)

        startActivity(intent)
    }

    companion object {
        const val INFO_EXTRA_MENSAGEM = "MENSAGEM"
        const val DATA_HORA = "Data/Hora"
    }
}