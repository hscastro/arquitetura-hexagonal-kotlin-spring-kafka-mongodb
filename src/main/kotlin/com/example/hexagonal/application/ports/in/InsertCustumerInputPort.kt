package com.example.hexagonal.application.ports.`in`

import com.example.hexagonal.application.core.domain.Custumer

interface InsertCustumerInputPort {
   fun insert(cliente: Custumer)
}