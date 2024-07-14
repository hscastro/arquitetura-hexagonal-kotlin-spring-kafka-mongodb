package com.example.hexagonal.adapters.out.client

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(name = "FindAddressByZipCodeClient", url="hscastro.client.address.url")
interface FindAddressByZipCodeClient {

    @GetMapping("/{zipcode}")
    fun find(@PathVariable("zipcode") zipCode: String): AddressResponse
}