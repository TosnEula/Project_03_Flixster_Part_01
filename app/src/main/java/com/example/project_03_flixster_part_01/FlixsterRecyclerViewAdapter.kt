package com.example.project_03_flixster_part_01

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class FlixsterRecyclerViewAdapter(
    private val movies: List<MovieItem>,
    flixsterFragment: FlixsterFragment,
)
    : RecyclerView.Adapter<FlixsterRecyclerViewAdapter.MovieViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_flixster, parent, false)
        return MovieViewHolder(view)
    }


    inner class MovieViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {

        val mMovieTitle: TextView = mView.findViewById<View>(R.id.movieTitle) as TextView
        val mMovieDescription: TextView = mView.findViewById<View>(R.id.movieDescription) as TextView
        val mMovieImage: ImageView = mView.findViewById<View>(R.id. movieImage) as ImageView

    }
    //This lets us "bind" each Views in the ViewHolder to its' actual data!
    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = movies[position]

        holder.mMovieTitle.text = movie.title
        holder.mMovieDescription.text = movie.description
        Glide.with(holder.mView)
            .load("https://image.tmdb.org/t/p/w500" + movie.movieImageUrl)
            .centerInside()
            .into(holder.mMovieImage)

        }

    override fun getItemCount(): Int {
        return movies.size
    }
}

