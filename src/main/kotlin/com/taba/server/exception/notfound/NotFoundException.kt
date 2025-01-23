package com.taba.server.exception.notfound

import com.taba.server.exception.TabaException
import org.springframework.http.HttpStatus

open class NotFoundException(
    message: String,
    code: Int
) : TabaException(HttpStatus.NOT_FOUND, message, code)
