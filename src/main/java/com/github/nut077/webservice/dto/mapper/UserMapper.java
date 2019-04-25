package com.github.nut077.webservice.dto.mapper;

import com.github.nut077.webservice.dto.UserDto;
import com.github.nut077.webservice.entity.User;
import org.mapstruct.*;
import org.springframework.util.Assert;

import java.util.Collection;
import java.util.List;

@Mapper(componentModel = "spring",
        uses = SetMapper.class
)
public interface UserMapper {

    @BeforeMapping
    default void beforeMapping(UserDto userDto) {
        Assert.isTrue(userDto.getName().length() > 1, () -> "Name should have atleast 2 characters");
        Assert.hasText(userDto.getPassword(), () -> "Password must has text");
    }

    @AfterMapping
    default void afterMapping(User user, @MappingTarget UserDto userDto) {
        userDto.setUpdatedDate(userDto.getUpdatedDate() != null ? userDto.getUpdatedDate() : user.getCreatedDate());
    }

    UserDto map(User entity);

    List<UserDto> map(Collection<User> entity);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "createdDate", ignore = true),
            @Mapping(target = "version", ignore = true)
    })
    User map(UserDto dto);

    List<User> map(List<UserDto> dto);
}
