package com.mthaler.sburredis

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SburRedisApplication

fun main(args: Array<String>) {
    runApplication<SburRedisApplication>(*args)
}
