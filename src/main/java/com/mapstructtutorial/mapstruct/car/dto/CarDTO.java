package com.mapstructtutorial.mapstruct.car.dto;


import com.mapstructtutorial.mapstruct.car.entity.Car;
import com.mapstructtutorial.mapstruct.car.enums.EnumCarColor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Builder
@Getter
public class CarDTO {
    private Long id;
    private String name;
    private Integer price;
    private List<String> options;
    private EnumCarColor color;
    private LocalDateTime regDttm;
    private String status;
    private String tempVehicleId;
    private Map<String, Object> testa = new HashMap<>();
    private List<String> testb= new ArrayList<>();

}
