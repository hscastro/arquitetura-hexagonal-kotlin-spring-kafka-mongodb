package com.example.hexagonal.application.core.usecase

import com.example.hexagonal.application.core.domain.Custumer
import com.example.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort
import com.example.hexagonal.application.ports.out.InsertCustumerOutputPort

class InsertCustumerUsecase (
    private val findAddressByZipCodeOutputPort: FindAddressByZipCodeOutputPort,
    private val insertCustumerOutputPort: InsertCustumerOutputPort
) {

    fun insert(custumer: Custumer, zipCode: String) {
        custumer.apply {
            address = findAddressByZipCodeOutputPort.find(zipCode)
        }.let {
            insertCustumerOutputPort.insert(it)
        }
    }
}