package com.example.hexagonal.adapters.out

import com.example.hexagonal.adapters.out.repositories.CustumerRepository
import com.example.hexagonal.adapters.out.repositories.entity.CustumerEntity
import com.example.hexagonal.adapters.out.repositories.mapper.CustumerEntityMapper
import com.example.hexagonal.application.core.domain.Custumer
import com.example.hexagonal.application.ports.out.InsertCustumerOutputPort
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class InsertCustumerAdapter (

    @Autowired
    private val custumerRepository: CustumerRepository,

    @Autowired
    private val custumerEntityMapper: CustumerEntityMapper

) : InsertCustumerOutputPort {

    override fun insert(custumer: Custumer) {
        var custumerEntity: CustumerEntity = custumerEntityMapper.toCustumerEntity(custumer)
        custumerRepository.save(custumerEntity)
    }
}