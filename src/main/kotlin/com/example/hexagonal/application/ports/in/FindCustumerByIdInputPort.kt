package com.example.hexagonal.application.ports.`in`

import com.example.hexagonal.application.core.domain.Custumer

interface FindCustumerByIdInputPort {
    fun find(id: String): Custumer
}