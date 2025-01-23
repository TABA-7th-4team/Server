package com.taba.server.exception

import org.springframework.http.HttpStatus

open class TabaException(
    val httpStatus: HttpStatus,
    override val message: String,
    val code: Int
) : RuntimeException(message)
