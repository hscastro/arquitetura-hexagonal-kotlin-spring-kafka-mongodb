package com.example.hexagonal

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

//@EnableFeignClients
@SpringBootApplication
class DemoHexagonalApplication

fun main(args: Array<String>) {
	runApplication<DemoHexagonalApplication>(*args)
}
