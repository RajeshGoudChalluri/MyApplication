package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [BlankFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [BlankFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BlankFragment : Fragment() {

    private lateinit var movieObject: Movie
    private lateinit var title : TextView
    private lateinit var genre : TextView
    private lateinit var year : TextView
    private val ARG_PARAM = "movieObject"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) {
            movieObject = arguments!!.getParcelable(ARG_PARAM)!!
        }
    }

    /*companion object {
        private val ARG_PARAM = "movieObject"

        *//**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param myObject as MyObject.
         * @return A new instance of fragment MyFragment.
         *//*
        fun newInstance(movieObject: Movie): BlankFragment {
            val fragment = BlankFragment()
            val args = Bundle()
            args.putParcelable(ARG_PARAM, movieObject)
            fragment.arguments = args
            return fragment
        }
    }*/

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_blank, container, false)

        title = rootView.findViewById(R.id.title)
        genre = rootView.findViewById(R.id.genre)
        year = rootView.findViewById(R.id.year)

        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        title.text = movieObject.title
        genre.text = movieObject.genre
        year.text = movieObject.year
    }
}
