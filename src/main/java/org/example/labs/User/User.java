package org.example.labs.User;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User{

    private static int _id = 1;

    {
        id = _id;
        _id++;
    }

    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String country;

    public User(String firstName, String lastName, int age, String country) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.country = country;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                '}';
    }
}
