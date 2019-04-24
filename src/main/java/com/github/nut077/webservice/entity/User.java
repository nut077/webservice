package com.github.nut077.webservice.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;

@ApiModel(description = "All details about user")
@Entity(name = "Users")
@SequenceGenerator(name = "users_seq")
@Table(indexes = {
    @Index(name = "users_idx_name", columnList = "name")
})
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class User extends Common {

    @Id
    @GeneratedValue(generator = "users_seq")
    private Long id;

    @Size(min = 2, message = "Name should have atleast 2 characters")
    @ApiModelProperty(notes = "Name should have atleast 2 characters")
    private String name;

    private String password;
}
