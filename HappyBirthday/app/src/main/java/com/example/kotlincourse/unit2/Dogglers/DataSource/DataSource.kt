package com.example.kotlincourse.unit2.Dogglers.DataSource

import com.example.kotlincourse.R
import com.example.kotlincourse.unit2.Dogglers.model.Dog

object DataSource {

    val dogs: List<Dog> = listOf(
        Dog(
            R.drawable.dog1,
            "Tzeitel",
            "7",
            "sunbathing"
        ),
        Dog(
            R.drawable.dog222,
            "Leroy",
            "4",
            "sleeping in dangerous places"

        ),

        Dog(
            R.drawable.dog3,
            "Frankie",
            "2",
            "stealing socks"
        ),
        Dog(
            R.drawable.dog4,
            "Nox",
            "8",
            "Meeting new animals"

        ))

}