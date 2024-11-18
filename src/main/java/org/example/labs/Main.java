package org.example.labs;

import org.example.labs.User.CreatorUserFactory;
import org.example.labs.User.UserFactory;
import org.example.labs.UserList.UserList;

public class Main {
    public static void main(String[] args) {
        UserFactory userFactory = new CreatorUserFactory();
        UserList userList = new UserList();

        userList.add(userFactory.createUser("Иван", "Гулидов", 7 ,"Россия"));
        userList.add(userFactory.createUser("Акакий", "Олегов", 31 ,"Россия"));
        userList.add(userFactory.createUser("Саша", "Иванов", 41 ,"Белоруссия"));

        userList.printSortedByAge();
        userList.averageAge();
        userList.cheakAgeAboveSeven();
        userList.distinctCountry();
    }
}
