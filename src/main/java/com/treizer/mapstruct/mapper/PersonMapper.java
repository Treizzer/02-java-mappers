package com.treizer.mapstruct.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.treizer.mapstruct.DTOs.PersonCustomDto;
import com.treizer.mapstruct.DTOs.PersonDefaultDto;
import com.treizer.mapstruct.entities.Person;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    PersonDefaultDto personToPersonDefaultDto(Person person);

    @Mapping(source = "id", target = "idDto")
    @Mapping(source = "name", target = "nameDto")
    @Mapping(source = "lastName", target = "lastNameDto")
    @Mapping(source = "email", target = "emailDto")
    @Mapping(source = "age", target = "ageDto")
    @Mapping(source = "gender", target = "genderDto")
    PersonCustomDto personToPersonCustomDto(Person person);

}
