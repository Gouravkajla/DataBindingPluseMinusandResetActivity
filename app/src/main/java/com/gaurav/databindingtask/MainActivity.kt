package com.gaurav.databindingtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gaurav.databindingtask.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var add =0
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.intValue=0
        binding.activity=this

    }
    public fun onClickAdd(){
        add++
        binding.intValue=add

    }
    public fun onClickReset(){
        add=0
        binding.intValue=add
    }
    public fun onClickMinus(){
        add--
        binding.intValue=add
    }
}