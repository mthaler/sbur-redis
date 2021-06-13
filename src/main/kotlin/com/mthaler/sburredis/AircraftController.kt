package com.mthaler.sburredis

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import java.io.IOException

@Controller
class AircraftController(private val repository: AircraftRepository) {

    @ResponseBody
    @GetMapping("/aircraft")
    @Throws(IOException::class)
    fun getAircrafts(): Iterable<Aircraft> = repository.findAll()
}