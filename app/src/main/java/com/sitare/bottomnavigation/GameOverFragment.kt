package com.sitare.bottomnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sitare.bottomnavigation.databinding.FragmentGameOverBinding

class GameOverFragment : Fragment() {
    private var _gameOverBinding : FragmentGameOverBinding? = null
    private val gameOverBinding get() = _gameOverBinding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _gameOverBinding = FragmentGameOverBinding.inflate(inflater, container, false)
        return gameOverBinding.root
    }
}