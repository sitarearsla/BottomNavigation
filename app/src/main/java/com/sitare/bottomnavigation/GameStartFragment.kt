package com.sitare.bottomnavigation

import android.graphics.Color
import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import com.sitare.bottomnavigation.databinding.FragmentGameStartBinding

class GameStartFragment : Fragment() {
    private var _gameStartBinding: FragmentGameStartBinding? = null
    private val gameStartBinding get() = _gameStartBinding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _gameStartBinding = FragmentGameStartBinding.inflate(inflater, container, false)
        gameStartBinding.toolbar.title = getString(R.string.toolbar_title)
        gameStartBinding.toolbar.subtitle = getString(R.string.toolbar_subtitle)
        gameStartBinding.toolbar.setLogo(R.drawable.image_home)
        gameStartBinding.toolbar.setTitleTextColor(Color.RED)

        (activity as AppCompatActivity).setSupportActionBar(gameStartBinding.toolbar)

        return gameStartBinding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.toolbar_menu, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.action_info -> {
                Toast.makeText(requireContext(), "Info", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.action_add -> {
                Toast.makeText(requireContext(), "Add", Toast.LENGTH_SHORT).show()
                return true
            }
         R.id.action_add -> {
                Toast.makeText(requireContext(), "Add", Toast.LENGTH_SHORT).show()
                return true
         }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _gameStartBinding = null
    }

}