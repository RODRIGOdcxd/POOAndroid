package com.example.proyecto3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var cAcceder = cAutenticacion()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Capturar los elemetos en constantes
        val vltxtusuario = findViewById<EditText>(R.id.txtUsuario)
        val vltxtpassword = findViewById<EditText>(R.id.txtPassword)
        val vlbtnAcceder = findViewById<Button>(R.id.btnAcceder)

        //Evento del boton cuando hagan click
        vlbtnAcceder.setOnClickListener(){
            var indAcceso = cAcceder.validarAcceso(vltxtusuario.text.toString(),vltxtpassword.text.toString())
            if (indAcceso == 1){
                abrirActivity()
            }else{
                Toast.makeText(this,"Error de acceso con el usuario",Toast.LENGTH_SHORT).show()
            }
        }

    }

    fun abrirActivity(){
        var nombreUsuario = cAcceder.obtenerDatosUsuario()
        var menus = cAcceder.Menu()
        val intent = Intent(this,frmPrincipal::class.java)
        intent.putExtra("dataUsuario",nombreUsuario)
        if (nombreUsuario[0] == "ADMINISTRADOR"){
            intent.putExtra("dataMenu",menus)
        }
        startActivity(intent)

    }

}