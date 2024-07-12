package com.example.hexagonal.adapters.`in`.controllers.mapper

import com.example.hexagonal.adapters.`in`.controllers.request.CustumerRequest
import com.example.hexagonal.application.core.domain.Custumer
import org.mapstruct.Mapper
import org.mapstruct.Mapping

@Mapper(componentModel = "spring")
interface CustumerMapper {

    @Mapping(target="id", ignore=true)
    @Mapping(target="address", ignore=true)
    @Mapping(target="isValidCpf", ignore=true)
    fun toCustumer(custumer: CustumerRequest): Custumer
}