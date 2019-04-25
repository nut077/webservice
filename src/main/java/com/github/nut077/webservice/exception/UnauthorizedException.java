package com.github.nut077.webservice.exception;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class UnauthorizedException  extends CommonException {

    private HttpStatus status = HttpStatus.UNAUTHORIZED;
    private final String code = String.valueOf(HttpStatus.UNAUTHORIZED.value());

    public UnauthorizedException(String message) {
        super(message);
    }
}
