package com.taba.server.exception.unauthorized

import com.taba.server.exception.TabaException
import org.springframework.http.HttpStatus

open class UnauthorizedException(
    message: String,
    code: Int
) : TabaException(HttpStatus.UNAUTHORIZED, message, code)
