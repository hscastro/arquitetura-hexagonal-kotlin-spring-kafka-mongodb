package com.example.hexagonal.adapters.out

import com.example.hexagonal.adapters.out.client.AddressResponseMapper
import com.example.hexagonal.adapters.out.client.FindAddressByZipCodeClient
import com.example.hexagonal.application.core.domain.Address
import com.example.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class FindAddressByZipCodeOutputAdapter(

    @Autowired
    private val findAddressByZipCodeClient: FindAddressByZipCodeClient,

    @Autowired
    private val addressResponseMapper: AddressResponseMapper

) : FindAddressByZipCodeOutputPort {

    override fun find(address: String): Address {
        var addressResponse = findAddressByZipCodeClient.find(address)
        return addressResponseMapper.toAddress(addressResponse)
    }
}