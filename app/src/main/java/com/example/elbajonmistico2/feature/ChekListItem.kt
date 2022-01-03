package com.example.elbajonmistico2.feature

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.elbajonmistico2.databinding.ItemListBinding

class ChekListItem:Fragment() {
    private var valor: Int = 0
    private var rawbinding: ItemListBinding?= null
    private val binding get() = rawbinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rawbinding = ItemListBinding.inflate(inflater,container,false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        isCheck()
    }

    private fun isCheck(): Int {
        with(binding){
            if (this?.check1?.isChecked == true){
                valor = valor + 5000
            }
            return valor

        }
    }
}