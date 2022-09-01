package com.storm.data.mapper

import com.storm.data.datasource.api.response.DogResponse
import com.storm.domain.model.DogImage

class DogMapper {

    fun map(lsResponse: List<DogResponse>): List<DogImage>{
        return lsResponse.filter { !it.breeds.isNullOrEmpty() }
                         .map { map(it) }
    }

    fun map(dog: DogResponse): DogImage{
        return DogImage(id = dog.id,
                        url = dog.url,
                        breed = dog.breeds!!.get(0).name
                        )
    }
}