package com.treizer.mapstruct;

import com.treizer.mapstruct.DTOs.PersonCustomDto;
import com.treizer.mapstruct.entities.Person;
import com.treizer.mapstruct.mapper.PersonMapper;

public class Main {

    /* Mapstruct - Default */
    /*
     * public static void main(String[] args) {
     * Person person = new Person(1L, "Hugo", "Santana", "hugo@mail.com", (byte) 25,
     * 'M');
     * System.out.println(person);
     * 
     * var personDefaultDto =
     * PersonMapper.INSTANCE.personToPersonDefaultDto(person);
     * System.out.println("\n" + personDefaultDto);
     * }
     */

    /* Mapstruct - Custom */
    public static void main(String[] args) {
        Person person = new Person(1L, "Hugo", "Santana", "hugo@mail.com", (byte) 25, 'M');
        System.out.println(person);

        // You can use "var"
        PersonCustomDto personCustomDto = PersonMapper.INSTANCE.personToPersonCustomDto(person);
        System.out.println("\n" + personCustomDto);
    }

}
