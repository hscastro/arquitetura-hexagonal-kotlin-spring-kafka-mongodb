package com.example.hexagonal.adapters.out.repositories.entity

import com.example.hexagonal.application.core.domain.Address
import lombok.Data
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Data
@Document(collection = "custumers")
data class CustumerEntity (

    @Id
    var id: String? = null,
    var nome: String,
    var address: Address? = null,
    var cpf: String,
    var isValidCpf: Boolean = false
)