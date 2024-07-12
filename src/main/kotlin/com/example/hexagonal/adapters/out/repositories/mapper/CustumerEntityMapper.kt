package com.example.hexagonal.adapters.out.repositories.mapper

import com.example.hexagonal.adapters.out.repositories.entity.CustumerEntity
import com.example.hexagonal.application.core.domain.Custumer
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface CustumerEntityMapper {

    fun toCustumerEntity(custumer: Custumer): CustumerEntity
    fun toCustumer(custumerEntity: CustumerEntity): Custumer
}