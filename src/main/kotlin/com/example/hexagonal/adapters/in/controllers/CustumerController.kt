package com.example.hexagonal.adapters.`in`.controllers

import com.example.hexagonal.adapters.`in`.controllers.mapper.CustumerMapper
import com.example.hexagonal.adapters.`in`.controllers.request.CustumerRequest
import com.example.hexagonal.application.core.domain.Custumer
import com.example.hexagonal.application.ports.`in`.InsertCustumerInputPort
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/custumers")
class CustumerController(

    @Autowired
    private val insertCustumerInputPort: InsertCustumerInputPort,

    @Autowired
    private val custumerMapper: CustumerMapper
) {

    @PostMapping
    fun insert(@Valid @RequestBody custumerRequest: CustumerRequest): ResponseEntity<Void> {
        var custumer: Custumer = custumerMapper.toCustumer(custumerRequest);
        insertCustumerInputPort.insert(custumer, custumerRequest.zipCode);
        return ResponseEntity.ok().build();
    }
}