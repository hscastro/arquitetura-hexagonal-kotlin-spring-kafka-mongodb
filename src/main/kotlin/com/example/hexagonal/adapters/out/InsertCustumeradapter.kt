package com.example.hexagonal.adapters.out

import com.example.hexagonal.adapters.out.repositories.CustumerRepository
import com.example.hexagonal.application.core.domain.Custumer
import com.example.hexagonal.application.ports.out.InsertCustumerOutputPort

class InsertCustumeradapter (
    private val custumerRepository: CustumerRepository
) : InsertCustumerOutputPort {

    override fun insert(custumer: Custumer) {
        custumerRepository.save(custumer)
    }
}