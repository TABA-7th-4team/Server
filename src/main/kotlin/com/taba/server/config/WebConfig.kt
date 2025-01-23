package com.taba.server.config

import lombok.RequiredArgsConstructor
import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpHeaders
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
@RequiredArgsConstructor
class WebConfig: WebMvcConfigurer {
    override fun addCorsMappings(registry: CorsRegistry) {
        registry.addMapping("/**")
            .allowedOrigins("*")
            .allowedMethods(*ALLOWED_METHOD_NAMES)
            .exposedHeaders(HttpHeaders.LOCATION)
            .maxAge(5000)
    }

    companion object {
        private val ALLOWED_METHOD_NAMES = arrayOf("GET", "HEAD", "POST", "PUT", "DELETE", "TRACE", "OPTIONS", "PATCH")
    }
}
