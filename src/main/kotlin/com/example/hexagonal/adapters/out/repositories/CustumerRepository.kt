package com.example.hexagonal.adapters.out.repositories

import com.example.hexagonal.adapters.out.repositories.entity.CustumerEntity
import org.springframework.data.mongodb.repository.MongoRepository

interface CustumerRepository : MongoRepository<CustumerEntity, String> {
}