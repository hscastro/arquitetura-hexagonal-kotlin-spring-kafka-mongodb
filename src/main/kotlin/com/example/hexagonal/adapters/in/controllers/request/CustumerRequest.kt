package com.example.hexagonal.adapters.`in`.controllers.request

import jakarta.validation.constraints.NotBlank
import lombok.Data

@Data
class CustumerRequest(

    @NotBlank
    var name: String,

    @NotBlank
    var cpf: String,

    @NotBlank
    var zipCode: String
)