package com.github.nut077.webservice.entity;

import lombok.*;

import javax.persistence.*;

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
    private String name;
    private String password;
}
