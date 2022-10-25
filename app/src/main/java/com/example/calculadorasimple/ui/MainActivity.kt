package com.example.calculadorasimple.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.calculadorasimple.R
import com.example.calculadorasimple.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private var operacionSeleccionada: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPlus.setOnClickListener {
            operacionSeleccionada = 1
            actualizarBotones()
        }
        binding.btnMinus.setOnClickListener {
            operacionSeleccionada = 2
            actualizarBotones()
        }
        binding.btnMult.setOnClickListener {
            operacionSeleccionada = 3
            actualizarBotones()
        }
        binding.btnDiv.setOnClickListener {
            operacionSeleccionada = 4
            actualizarBotones()
        }
        binding.btnEqual.setOnClickListener {
            val val1 = binding.textInputEditTextValor1.text.toString()
            val val2 = binding.textInputEditTextValor2.text.toString()

            if (val1.isBlank() || val2.isBlank()) {
                return@setOnClickListener
            }
            val resultado = resolverOperacion(val1.toInt(), val2.toInt())

            resultado?.let {
                resultado->binding.textViewResultado.text = "$resultado"
            }
        }
        binding.btnReset.setOnClickListener {
            operacionSeleccionada=0
            actualizarBotones()
            binding.textViewResultado.text = "0"
            binding.textInputEditTextValor1.setText("")
            binding.textInputEditTextValor2.setText("")
        }
    }

    private fun resolverOperacion(val1: Int, val2: Int): Int? {
       return  when (operacionSeleccionada) {
            1 -> val1 + val2
            2 -> val1 - val2
            3 -> val1 * val2
            4 -> val1 / val2
            else -> null
        }
    }

    private fun actualizarBotones() {
        when (operacionSeleccionada) {
            0 -> {
                binding.btnPlus.setBackgroundColor(
                    ContextCompat.getColor(
                        this,
                        android.R.color.darker_gray
                    )
                )
                binding.btnMinus.setBackgroundColor(
                    ContextCompat.getColor(
                        this,
                        android.R.color.darker_gray
                    )
                )
                binding.btnMult.setBackgroundColor(
                    ContextCompat.getColor(
                        this,
                        android.R.color.darker_gray
                    )
                )
                binding.btnDiv.setBackgroundColor(
                    ContextCompat.getColor(
                        this,
                        android.R.color.darker_gray
                    )
                )

            }
            1 -> {
                binding.btnPlus.setBackgroundColor(
                    ContextCompat.getColor(
                        this,
                        android.R.color.system_accent1_700
                    )
                )
                binding.btnMinus.setBackgroundColor(
                    ContextCompat.getColor(
                        this,
                        android.R.color.darker_gray
                    )
                )
                binding.btnMult.setBackgroundColor(
                    ContextCompat.getColor(
                        this,
                        android.R.color.darker_gray
                    )
                )
                binding.btnDiv.setBackgroundColor(
                    ContextCompat.getColor(
                        this,
                        android.R.color.darker_gray
                    )
                )
            }
            2 -> {
                binding.btnPlus.setBackgroundColor(
                    ContextCompat.getColor(
                        this,
                        android.R.color.darker_gray
                    )
                )
                binding.btnMinus.setBackgroundColor(
                    ContextCompat.getColor(
                        this,
                        android.R.color.system_accent1_700
                    )
                )
                binding.btnMult.setBackgroundColor(
                    ContextCompat.getColor(
                        this,
                        android.R.color.darker_gray                    )
                )
                binding.btnDiv.setBackgroundColor(
                    ContextCompat.getColor(
                        this,
                        android.R.color.darker_gray
                    )
                )
            }
            3 -> {
                binding.btnPlus.setBackgroundColor(
                    ContextCompat.getColor(
                        this,
                        android.R.color.darker_gray
                    )
                )
                binding.btnMinus.setBackgroundColor(
                    ContextCompat.getColor(
                        this,
                        android.R.color.darker_gray
                    )
                )
                binding.btnMult.setBackgroundColor(
                    ContextCompat.getColor(
                        this,
                        android.R.color.system_accent1_700
                    )
                )
                binding.btnDiv.setBackgroundColor(
                    ContextCompat.getColor(
                        this,
                        android.R.color.darker_gray
                    )
                )

            }
            4 -> {
                binding.btnPlus.setBackgroundColor(
                    ContextCompat.getColor(
                        this,
                        android.R.color.darker_gray
                    )
                )
                binding.btnMinus.setBackgroundColor(
                    ContextCompat.getColor(
                        this,
                        android.R.color.darker_gray
                    )
                )
                binding.btnMult.setBackgroundColor(
                    ContextCompat.getColor(
                        this,
                        android.R.color.darker_gray
                    )
                )
                binding.btnDiv.setBackgroundColor(
                    ContextCompat.getColor(
                        this,
                        android.R.color.system_accent1_700
                    )
                )

            }
            else -> Unit


        }
    }
}