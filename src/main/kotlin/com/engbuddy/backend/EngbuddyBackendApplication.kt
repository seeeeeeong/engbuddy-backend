package com.engbuddy.backend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
class EngbuddyBackendApplication

fun main(args: Array<String>) {
	runApplication<EngbuddyBackendApplication>(*args)
}
