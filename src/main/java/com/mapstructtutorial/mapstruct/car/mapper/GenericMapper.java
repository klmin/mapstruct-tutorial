package com.mapstructtutorial.mapstruct.car.mapper;

public interface GenericMapper<D, E> {
    D toDto(E entity);
    E toEntity(D dto);
}
