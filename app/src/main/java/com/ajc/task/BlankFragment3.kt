package com.ajc.task

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_blank3.*

class BlankFragment3 : Fragment() {
    private var num1: Int = 1
    private var num3: Int = 5
    private var clickListener: CommunicationInterface? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        clickListener = context as CommunicationInterface
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) num3 = requireArguments().getInt("apples")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragTv3.setText(num3)
        initViews(view)
    }

    private fun initViews(view: View) {
        buttonThree.setOnClickListener() {
            val bundle = Bundle()
            bundle.putInt("apples", num1 + 3)
            clickListener!!.onClick(bundle)
        }
    }
}