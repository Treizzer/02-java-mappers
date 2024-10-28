package com.treizer.mapstruct.mapper;

import com.treizer.mapstruct.DTOs.PersonCustomDto;
import com.treizer.mapstruct.DTOs.PersonDefaultDto;
import com.treizer.mapstruct.entities.Person;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-28T16:48:51-0600",
    comments = "version: 1.6.2, compiler: Eclipse JDT (IDE) 3.40.0.v20240919-1711, environment: Java 21.0.3 (Eclipse Adoptium)"
)
public class PersonMapperImpl implements PersonMapper {

    @Override
    public PersonDefaultDto personToPersonDefaultDto(Person person) {
        if ( person == null ) {
            return null;
        }

        PersonDefaultDto personDefaultDto = new PersonDefaultDto();

        personDefaultDto.setId( person.getId() );
        personDefaultDto.setName( person.getName() );
        personDefaultDto.setLastName( person.getLastName() );
        personDefaultDto.setEmail( person.getEmail() );
        personDefaultDto.setAge( person.getAge() );
        personDefaultDto.setGender( person.getGender() );

        return personDefaultDto;
    }

    @Override
    public PersonCustomDto personToPersonCustomDto(Person person) {
        if ( person == null ) {
            return null;
        }

        PersonCustomDto personCustomDto = new PersonCustomDto();

        personCustomDto.setIdDto( person.getId() );
        personCustomDto.setNameDto( person.getName() );
        personCustomDto.setLastNameDto( person.getLastName() );
        personCustomDto.setEmailDto( person.getEmail() );
        personCustomDto.setAgeDto( person.getAge() );
        personCustomDto.setGenderDto( person.getGender() );

        return personCustomDto;
    }
}
