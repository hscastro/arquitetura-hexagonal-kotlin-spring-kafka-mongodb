package com.example.hexagonal.application.core.domain

class Custumer (
    var id: String? = null,
    var nome: String,
    var address: Address? = null,
    var cpf: String,
    var isValidCpf: Boolean = false
)