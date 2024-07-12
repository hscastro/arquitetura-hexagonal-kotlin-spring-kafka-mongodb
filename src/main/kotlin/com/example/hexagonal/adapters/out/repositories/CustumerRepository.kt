package com.example.hexagonal.adapters.out.repositories

import com.example.hexagonal.application.core.domain.Custumer
import org.springframework.data.mongodb.repository.MongoRepository

interface CustumerRepository : MongoRepository<Custumer, String> {
}