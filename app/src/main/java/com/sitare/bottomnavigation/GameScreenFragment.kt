package com.sitare.bottomnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sitare.bottomnavigation.databinding.FragmentGameScreenBinding

class GameScreenFragment : Fragment() {
    private var _gameScreenBinding : FragmentGameScreenBinding? = null
    private val gameScreenBinding get() = _gameScreenBinding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _gameScreenBinding = FragmentGameScreenBinding.inflate(inflater, container, false)
        return gameScreenBinding.root
    }
}