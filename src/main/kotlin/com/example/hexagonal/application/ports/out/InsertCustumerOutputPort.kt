package com.example.hexagonal.application.ports.out

import com.example.hexagonal.application.core.domain.Custumer

interface InsertCustumerOutputPort {

    fun insert(custumer: Custumer)
}