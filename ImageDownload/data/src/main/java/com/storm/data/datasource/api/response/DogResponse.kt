package com.storm.data.datasource.api.response

import com.google.gson.annotations.SerializedName

data class DogResponse(
    @SerializedName("breeds") val breeds : List<Breed>?,
    @SerializedName("id") val id : String,
    @SerializedName("url") val url : String,
    @SerializedName("width") val width : Int,
    @SerializedName("height") val height : Int
)

data class Breed(
    @SerializedName("weight")
    val weight: Measurement,

    @SerializedName("height")
    val height: Measurement,

    @SerializedName("id")
    val id: Int,

    @SerializedName("name")
    val name: String,

    @SerializedName("bred_for")
    val bred_for: String,

    @SerializedName("breed_group")
    val breed_group: String,

    @SerializedName("life_span")
    val life_span: String,

    @SerializedName("temperament")
    val temperament: String,

    @SerializedName("origin")
    val origin: String,

    @SerializedName("reference_image_id")
    val reference_image_id: String
)

data class Measurement(
    @SerializedName("imperial")
    val imperial: String,

    @SerializedName("metric")
    val metric: String
)
