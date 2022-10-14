package com.example.springktautowiringconstructor

import org.springframework.stereotype.Component

/**
 **
 ** https://youtrack.jetbrains.com/issue/IDEA-303066
 */
@Component
class ComponentWithInitializedStringParameter(private val demo: String = "init_String")
{
    override fun toString(): String {
        return "ComponentWithInitializedStringParameter(demo='$demo')"
    }
}