package com.github.nut077.webservice.exception;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class NotFoundException extends CommonException {

    private HttpStatus status = HttpStatus.NOT_FOUND;
    private final String code = String.valueOf(HttpStatus.NOT_FOUND.value());

    public NotFoundException(String message) {
        super(message);
    }
}
