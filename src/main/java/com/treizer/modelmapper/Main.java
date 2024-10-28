package com.treizer.modelmapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;

import com.treizer.modelmapper.DTOs.PersonCustomDto;
import com.treizer.modelmapper.entities.Person;

public class Main {

    /* Model Mapper - Default */
    /*
     * public static void main(String[] args) {
     * ModelMapper modelMapper = new ModelMapper();
     * 
     * Person person = new Person(1L, "Hugo", "Santana", "hugo@mail.com", (byte) 25,
     * 'M');
     * System.out.println(person);
     * 
     * var personDefaultDto = modelMapper.map(person, PersonDefaultDto.class);
     * System.out.println("\n" + personDefaultDto);
     * }
     */

    /* Model Mapper - Custom */
    public static void main(String[] args) {
        ModelMapper modelMapper = new ModelMapper();

        TypeMap<Person, PersonCustomDto> propertyMapper = modelMapper.createTypeMap(Person.class,
                PersonCustomDto.class);
        propertyMapper.addMapping(Person::getId, PersonCustomDto::setIdDto);
        propertyMapper.addMapping(Person::getName, PersonCustomDto::setNameDto);
        propertyMapper.addMapping(Person::getLastName, PersonCustomDto::setLastNameDto);
        propertyMapper.addMapping(Person::getEmail, PersonCustomDto::setEmailDto);
        propertyMapper.addMapping(Person::getAge, PersonCustomDto::setAgeDto);
        propertyMapper.addMapping(Person::getGender, PersonCustomDto::setGenderDto);

        Person person = new Person(1L, "Hugo", "Santana", "hugo@mail.com", (byte) 25, 'M');
        System.out.println(person);

        var personCustomDto = propertyMapper.map(person);
        System.out.println("\n" + personCustomDto);
    }

}