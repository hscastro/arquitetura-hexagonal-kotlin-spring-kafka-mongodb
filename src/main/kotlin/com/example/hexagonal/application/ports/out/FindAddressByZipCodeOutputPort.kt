package com.example.hexagonal.application.ports.out

import com.example.hexagonal.application.core.domain.Address

interface FindAddressByZipCodeOutputPort {

    fun find(address: String): Address
}