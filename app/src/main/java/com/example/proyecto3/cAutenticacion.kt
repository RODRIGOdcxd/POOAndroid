package com.example.proyecto3

import kotlin.contracts.Returns

class cAutenticacion {
    fun validarAcceso(usuario:String, contrasena:String) : Int {
        var indAcceso = 0
        if (usuario == "admin" && contrasena == "1234"){
            indAcceso = 1
        }
        return indAcceso
    }

    fun obtenerDatosUsuario():Array<String>{
        return arrayOf("ADMINISTRADOR","C0000001")
    }

    fun Menu():Array<String>{
        return arrayOf("HISTORIAL","COMPRAS","VENTAS")
    }
}