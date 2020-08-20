package com.springboot.kotlin.firstkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FirstkotlinApplication

fun main(args: Array<String>) {
    runApplication<FirstkotlinApplication>(*args)
    println("welcome kotlin to springboot!!")
	
}
