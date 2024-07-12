package com.example.hexagonal

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoHexagonalApplication

fun main(args: Array<String>) {
	runApplication<DemoHexagonalApplication>(*args)
}
