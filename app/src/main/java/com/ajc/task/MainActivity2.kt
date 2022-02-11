package com.ajc.task

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity2 : AppCompatActivity(), CommunicationInterface {
    private val fragmentManager: FragmentManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    override fun onClick(bundle: Bundle?) {
        val fragmentTransaction: FragmentTransaction = fragmentManager?.beginTransaction()!!
        val startFrg4 = BlankFragment4()
        startFrg4.arguments = bundle
        fragmentTransaction.add(R.id.container, startFrg4, "Buy").addToBackStack("Buy")
            .commit()
    }

    override fun onClick1(bundle: Bundle?) {
        val fragmentTransaction: FragmentTransaction = fragmentManager?.beginTransaction()!!
        val startFrg3 = BlankFragment3()
        startFrg3.arguments = bundle
        fragmentTransaction.add(R.id.container, startFrg3, "Buy").addToBackStack("Buy")
            .commit()
    }
}