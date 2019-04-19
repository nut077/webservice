package com.github.nut077.webservice.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

@Getter
@Setter
public class UserDto {

    private Long id;
    private String name;
    private String password;
    private OffsetDateTime updatedDate;
}
