package com.example.hexagonal.application.ports.out

import com.example.hexagonal.application.core.domain.Custumer

interface FindCustumerByIdOutputPort {
    fun find(id: String): Custumer
}