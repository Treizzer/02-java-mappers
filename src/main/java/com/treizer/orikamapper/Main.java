package com.treizer.orikamapper;

import com.treizer.orikamapper.DTOs.PersonCustomDto;
import com.treizer.orikamapper.entities.Person;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

public class Main {

    /* Orika Mapper - Default */
    /*
     * public static void main(String[] args) {
     * MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
     * mapperFactory.classMap(Person.class, PersonDefaultDto.class);
     * 
     * MapperFacade mapperFacade = mapperFactory.getMapperFacade();
     * 
     * Person person = new Person(1L, "Hugo", "Santana", "hugo@mail.com", (byte) 25,
     * 'M');
     * System.out.println(person);
     * 
     * var personDefaultDto = mapperFacade.map(person, PersonDefaultDto.class);
     * System.out.println(personDefaultDto);
     * }
     */

    /* Orika Mapper - Custom */
    public static void main(String[] args) {
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
        mapperFactory.classMap(Person.class, PersonCustomDto.class)
                .field("id", "idDto")
                .field("name", "nameDto")
                .field("lastName", "lastNameDto")
                .field("email", "emailDto")
                .field("age", "ageDto")
                .field("gender", "genderDto")
                .byDefault()
                .register();

        MapperFacade mapperFacade = mapperFactory.getMapperFacade();

        Person person = new Person(1L, "Hugo", "Santana", "hugo@mail.com", (byte) 25, 'M');
        System.out.println(person);

        var personCustomDto = mapperFacade.map(person, PersonCustomDto.class);
        System.out.println("\n" + personCustomDto);
    }

}
