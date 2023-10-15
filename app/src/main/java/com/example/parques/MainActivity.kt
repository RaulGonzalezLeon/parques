package com.example.parques

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.parques.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bGuardar.setOnClickListener {
            Log.d("NOMBRE: ", binding.tbNombre.text.toString())
            Log.d("DESCRIPCION: ", binding.tbDescripcion.text.toString())
            Log.d("TELEFONO: ", binding.tbTelefono.text.toString())
            Log.d("WEB: ", binding.tbWeb.text.toString())
            Log.d("APERTURA: ", binding.hApertura.selectedItem.toString())
            Log.d("CIERRE: ", binding.hCierre.selectedItem.toString())
            Log.d("DEPORTES: ", binding.cbDeportes.isChecked.toString())
            Log.d("PARQUE INFANTIL: ", binding.cbParqueInfantil.isChecked.toString())
            Log.d("RESTAURANTE: ", binding.cbRestaurante.isChecked.toString())
            Log.d("ZONA DE MASCOTAS: ", binding.cbZonaDeMascotas.isChecked.toString())
        }
    }
}