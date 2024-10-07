package com.mapstructtutorial.mapstruct.car.dto;

import com.mapstructtutorial.mapstruct.car.enums.EnumUserStatus;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class UserDTO {
    private Long userId;
    private String userName;
    private Integer age;
    private EnumUserStatus status;
}
