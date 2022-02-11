package com.ajc.task

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_blank3.*

class BlankFragment4 : Fragment() {
    private var num2: Int = 2
    private var num4: Int = 4
    private var clickListener: CommunicationInterface? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        clickListener = context as CommunicationInterface
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank4, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) num4 = requireArguments().getInt("apples")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews(view)
        fragTv3.setText(num4)
    }

    private fun initViews(view: View) {
        buttonThree.setOnClickListener() {
            val bundle = Bundle()
            bundle.putInt("apples1", num2 * 2)
            clickListener!!.onClick1(bundle)
        }
    }
}