package com.example.hexagonal.config

import com.example.hexagonal.application.core.usecase.FindCustumerByIdUsecase
import com.example.hexagonal.application.ports.out.FindCustumerByIdOutputPort
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
public class FindCustumerInputConfig(

    private val findCustumerByIdOutputPort: FindCustumerByIdOutputPort
){

    @Bean
    fun findCustumerConfig(): FindCustumerByIdUsecase {
        return FindCustumerByIdUsecase(findCustumerByIdOutputPort);
    }
}