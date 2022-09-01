package com.storm.imagedownload.config

import org.gradle.kotlin.dsl.DependencyHandlerScope

class Dependencies{

}

object Versions{
    val retrofit: String = "2.9.0"
    val dagger: String = "2.43.2"
}

object Dagger{
    val core: String = "com.google.dagger:dagger:${Versions.dagger}"
    val compiler: String = "com.google.dagger:dagger-compiler:${Versions.dagger}"
}

fun DependencyHandlerScope.addApiRetrofit(){
    "api"("com.squareup.retrofit2:converter-gson:${Versions.retrofit}")
    "api"("com.squareup.retrofit2:retrofit:${Versions.retrofit}")
    "api"("com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}")
}

fun DependencyHandlerScope.addDagger(){
    "implementation"(Dagger.core)
    "kapt"(Dagger.compiler)
}