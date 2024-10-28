package com.treizer.modelmapper.DTOs;

public class PersonDefaultDto {

    private Long id;
    private String name;
    private String lastName;
    private String email;
    private Byte age;
    private Character gender;

    public PersonDefaultDto() {
    }

    public PersonDefaultDto(Long id, String name, String lastName, String email, Byte age, Character gender) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "PersonDefaultDto {id=" + id + ", name=" + name + ", lastName=" + lastName + ", email=" + email
                + ", age=" + age + ", gender=" + gender + "}";
    }

}
