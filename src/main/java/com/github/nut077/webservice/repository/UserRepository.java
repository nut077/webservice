package com.github.nut077.webservice.repository;

import com.github.nut077.webservice.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends Common<User, Long> {
}
