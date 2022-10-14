package com.example.springktautowiringconstructor

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringKtAutowiringConstructorApplication: CommandLineRunner {

    @Autowired
    private lateinit var componentWithInitializedStringParameter: ComponentWithInitializedStringParameter

    @Autowired
    private lateinit var compoWithNotRequiredDependencyInSecondaryConstructor: CompoWithNotRequiredDependencyInSecondaryConstructor

    @Autowired
    private lateinit var compoWithNotRequiredDependencyInConstructor: CompoWithNotRequiredDependencyInConstructor

    @Autowired
    private lateinit var compoWithRequiredDependencyInConstructor: ComponentWithRequiredDependencyInConstructor



    override fun run(vararg args: String?) {
        println(compoWithNotRequiredDependencyInConstructor.toString())
        println(compoWithNotRequiredDependencyInSecondaryConstructor.toString())
        println(compoWithRequiredDependencyInConstructor.toString())
        println(componentWithInitializedStringParameter.toString())
    }
}
fun main(args: Array<String>) {
    runApplication<SpringKtAutowiringConstructorApplication>(*args)

}