package com.backend.core.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Sok Lina
 * Date     : 2/2/2021, 8:01 AM
 * Email    : lina.sok@prasac.com.kh
 */
@ResponseStatus
public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String message) {
        super(message);
    }

    public ResourceNotFoundException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
