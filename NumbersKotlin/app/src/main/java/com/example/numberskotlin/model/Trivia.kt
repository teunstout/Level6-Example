package com.example.numberskotlin.model

import com.google.gson.annotations.SerializedName

/**
 * SerializedName confert de naamgeving naar de naamgeving van jou.
 */
data class Trivia(
    @SerializedName("text") var text: String,
    @SerializedName("number") var number: Int,
    @SerializedName("found") var found: Boolean,
    @SerializedName("type") var type: String
)
