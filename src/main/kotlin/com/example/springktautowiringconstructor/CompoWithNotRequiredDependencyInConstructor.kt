package com.example.springktautowiringconstructor

import org.springframework.stereotype.Component

/**
 * https://youtrack.jetbrains.com/issue/IDEA-303718
 * */
@Component
class CompoWithNotRequiredDependencyInConstructor(private val myService: MyService? = null) {
    init {
        println("component with not required dependency is initialized")
        println(myService)
    }

    override fun toString(): String {
        return "CompoWithNotRequiredDependencyInConstructor with "+ (myService?.id ?: "nothing");
    }

}