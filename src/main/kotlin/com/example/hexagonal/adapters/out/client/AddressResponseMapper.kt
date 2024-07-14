package com.example.hexagonal.adapters.out.client

import com.example.hexagonal.application.core.domain.Address
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface AddressResponseMapper {

    fun toAddress(addressResponse: AddressResponse): Address
}