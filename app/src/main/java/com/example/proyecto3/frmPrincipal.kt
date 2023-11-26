package com.example.proyecto3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class frmPrincipal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frm_principal)

        val dataUsuario = intent.getStringArrayExtra("dataUsuario")
        //variables que almacenan los elementos
        val us = findViewById<TextView>(R.id.txtUsus)
        val cod = findViewById<TextView>(R.id.txtCod)

        us.text = dataUsuario!![0]
        cod.text = dataUsuario[1]
        if (dataUsuario[0] == "ADMINISTRADOR"){
            val dataMenu = intent.getStringArrayExtra("dataMenu")
            var txtmenu1 = findViewById<TextView>(R.id.txtmenu1)
            var txtmenu2 = findViewById<TextView>(R.id.txtmenu2)
            var txtmenu3 = findViewById<TextView>(R.id.txtmenu3)
            txtmenu1.text = dataMenu!![0]
            txtmenu2.text = dataMenu[1]
            txtmenu3.text = dataMenu[2]
        }
        else{
            var txtmenu1 = findViewById<TextView>(R.id.txtmenu1)
            txtmenu1.text = "NADA"
        }
    }
}