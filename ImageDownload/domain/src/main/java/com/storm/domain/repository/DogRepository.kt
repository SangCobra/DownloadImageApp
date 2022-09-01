package com.storm.domain.repository

import com.storm.domain.model.DogImage

interface DogRepository {
    fun getListDogs(): List<DogImage>
}