package com.example.springktautowiringconstructor

import org.springframework.stereotype.Component

@Component
class ComponentWithRequiredDependencyInConstructor(private val myService: MyService) {
    init {
        println("component with required dependency is initialized")
        println(myService)
    }

    override fun toString(): String {
        return "ComponentWithRequiredDependencyInConstructor with ${myService.id}";
    }

}