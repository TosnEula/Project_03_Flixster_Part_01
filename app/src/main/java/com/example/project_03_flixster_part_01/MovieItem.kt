package com.example.project_03_flixster_part_01

import com.google.gson.annotations.SerializedName


//Need to add serialized names from the json
class MovieItem {
    @SerializedName("title")
    var title: String? = null

    @SerializedName("overview")
    var description: String? = null

    @SerializedName("poster_path")
    var movieImageUrl: String? = null

}