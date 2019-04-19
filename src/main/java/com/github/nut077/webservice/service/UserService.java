package com.github.nut077.webservice.service;

import com.github.nut077.webservice.dto.UserDto;
import com.github.nut077.webservice.dto.mapper.UserMapper;
import com.github.nut077.webservice.exception.NotFoundException;
import com.github.nut077.webservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public List<UserDto> findAll() {
        return userMapper.map(userRepository.findAll());
    }

    public UserDto findById(Long id) {
        return userMapper.map(userRepository.findById(id).orElseThrow(() -> new NotFoundException("User id: " + id + " not found")));
    }

    public UserDto save(UserDto userDto) {
        return userMapper.map(userRepository.save(userMapper.map(userDto)));
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
