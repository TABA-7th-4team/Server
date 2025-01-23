package com.taba.server.exception.badrequest

import com.taba.server.exception.TabaException
import org.springframework.http.HttpStatus

open class BadRequestException(
    message: String,
    code: Int
) : TabaException(HttpStatus.BAD_REQUEST, message, code)
