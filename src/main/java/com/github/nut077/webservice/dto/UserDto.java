package com.github.nut077.webservice.dto;

import com.github.nut077.webservice.entity.Post;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;
import java.util.List;

@ApiModel(description = "All details about user")
@Getter
@Setter
public class UserDto {

    private Long id;
    @ApiModelProperty(notes = "Name should have atleast 2 characters")
    private String name;
    private String password;
    private OffsetDateTime birthdate;
    private List<Post> posts;
}
