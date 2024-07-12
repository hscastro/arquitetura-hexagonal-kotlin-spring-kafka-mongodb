package com.example.hexagonal.application.core.usecase

import com.example.hexagonal.application.core.domain.Custumer
import com.example.hexagonal.application.ports.`in`.FindCustumerByIdInputPort
import com.example.hexagonal.application.ports.out.FindCustumerByIdOutputPort

class FindCustumerByIdUsecase(
    private val findCustumerByIdOutputPort: FindCustumerByIdOutputPort
) : FindCustumerByIdInputPort {

    override fun find(id: String): Custumer {
         return findCustumerByIdOutputPort.find(id)
    }
}