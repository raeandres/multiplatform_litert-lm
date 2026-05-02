package org.example.project.multiplaform.litert

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform