package com.example.calculadorasimple.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculadorasimple.R
import com.example.calculadorasimple.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private var operacionSeleccionada : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPlus.setOnClickListener{
            operacionSeleccionada = 1
            actualizarBotones()
        }

    }

    private fun actualizarBotones() {
        when(operacionSeleccionada){
            0->{

            }
            1->{

            }
            2->{

            }
            3->{

            }
            4->{

            }
            else->Unit


        }
    }
}