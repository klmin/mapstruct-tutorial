package com.mapstructtutorial.mapstruct.car.mapper;

import com.mapstructtutorial.mapstruct.car.dto.UserDTO;
import com.mapstructtutorial.mapstruct.car.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper extends GenericMapper<UserDTO, User> {
}
