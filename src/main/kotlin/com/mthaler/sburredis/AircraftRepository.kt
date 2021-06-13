package com.mthaler.sburredis

import org.springframework.data.repository.CrudRepository

interface AircraftRepository: CrudRepository<Aircraft, Long>