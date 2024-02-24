package com.example.myapplication.R

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.myapplication.R

class StoryFragment : Fragment() {

    private lateinit var histoire: Histoire

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        histoire = arguments?.getSerializable("histoire") as Histoire
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_story, container, false)

        val textViewStory = view.findViewById<TextView>(R.id.textViewStory)
        textViewStory.text = histoire.texte

        return view
    }

    companion object {
        fun newInstance(histoire: Histoire): StoryFragment {
            val fragment = StoryFragment()
            val args = Bundle()
            args.putSerializable("histoire", histoire)
            fragment.arguments = args
            return fragment
        }
    }
}