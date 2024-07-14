package com.example.hexagonal.config

import com.example.hexagonal.application.core.usecase.InsertCustumerUsecase
import com.example.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort
import com.example.hexagonal.application.ports.out.InsertCustumerOutputPort
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class InsertCustumerInputConfig(
    private val findAddressByZipCodeOutputPort: FindAddressByZipCodeOutputPort,
    private val insertCustumerOutputPort: InsertCustumerOutputPort
) {

    @Bean
    fun insertCustumerConfig(): InsertCustumerUsecase {
        return InsertCustumerUsecase(findAddressByZipCodeOutputPort, insertCustumerOutputPort);
    }
}