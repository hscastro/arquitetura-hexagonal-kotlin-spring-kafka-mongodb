package com.example.hexagonal.adapters.out.client

import lombok.Data

@Data
class AddressResponse(
    private var street: String? = null,
    private var city: String? = null,
    private var state: String? = null
)
