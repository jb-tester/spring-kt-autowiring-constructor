package com.example.springktautowiringconstructor

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class CompoWithNotRequiredDependencyInSecondaryConstructor(private val c:ComponentWithRequiredDependencyInConstructor) {
    private var myService: MyService? = null

    @Autowired constructor(myService: MyService? = null, c:ComponentWithRequiredDependencyInConstructor):this(c) {
        this.myService = myService
        println("component with not required dependency is in secondary constructor initialized")
        println(myService)
    }

    override fun toString(): String {
        return "CompoWithNotRequiredDependencyInSecondaryConstructor with "+ (myService?.id ?: "nothing");
    }

}