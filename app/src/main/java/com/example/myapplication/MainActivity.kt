package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class MainActivity : AppCompatActivity() , OnClickItemListener{

    private val movieList = ArrayList<Movie>()
    private var recyclerView: RecyclerView? = null
    private var mAdapter: MoviesAdapter?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "Movies List"

        recyclerView = findViewById(R.id.recycler_view)

        mAdapter = MoviesAdapter(movieList as List<Movie>,this)
        val mLayoutManager = LinearLayoutManager(applicationContext)
        recyclerView!!.layoutManager = mLayoutManager
        recyclerView!!.itemAnimator = DefaultItemAnimator()
        recyclerView!!.adapter = mAdapter


        recyclerView?.setOnClickListener() {


        }
        prepareMovieData()
    }


    fun callMethod() {
        val asc = Array(5, { i -> i * 2 }) // o, 2,  4,8,
    }


    override fun onClick(movie: Movie) {
        val user = User("Hello User",28)
        user.age = 33

        val fragment = BlankFragment()

        val bundle = Bundle()
        bundle.putParcelable("movieObject",movie)

        fragment.arguments = bundle
        ActivityUtil.addFragmentToActivity(supportFragmentManager,fragment,R.id.fragment_container)
    }

    private fun prepareMovieData() {
        var movie = Movie("Mad Max: Fury Road", "Action & Adventure", "2015")
        movieList.add(movie)

        movie = Movie("Inside Out", "Animation, Kids & Family", "2015")
        movieList.add(movie)

        movie = Movie("Star Wars: Episode VII - The Force Awakens", "Action", "2015")
        movieList.add(movie)

        movie = Movie("Shaun the Sheep", "Animation", "2015")
        movieList.add(movie)

        movie = Movie("The Martian", "Science Fiction & Fantasy", "2015")
        movieList.add(movie)

        movie = Movie("Mission: Impossible Rogue Nation", "Action", "2015")
        movieList.add(movie)

        movie = Movie("Up", "Animation", "2009")
        movieList.add(movie)

        movie = Movie("Star Trek", "Science Fiction", "2009")
        movieList.add(movie)

        movie = Movie("The LEGO Movie", "Animation", "2014")
        movieList.add(movie)

        movie = Movie("Iron Man", "Action & Adventure", "2008")
        movieList.add(movie)

        movie = Movie("Aliens", "Science Fiction", "1986")
        movieList.add(movie)

        movie = Movie("Chicken Run", "Animation", "2000")
        movieList.add(movie)

        movie = Movie("Back to the Future", "Science Fiction", "1985")
        movieList.add(movie)

        movie = Movie("Raiders of the Lost Ark", "Action & Adventure", "1981")
        movieList.add(movie)

        movie = Movie("Goldfinger", "Action & Adventure", "1965")
        movieList.add(movie)

        movie = Movie("Guardians of the Galaxy", "Science Fiction & Fantasy", "2014")
        movieList.add(movie)

        mAdapter!!.notifyDataSetChanged()
    }
}