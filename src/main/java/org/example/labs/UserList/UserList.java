package org.example.labs.UserList;
import org.example.labs.User.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserList {
    private List<User> userList = new ArrayList<>();

    public void add(User user){
        userList.add(user);
    }

    public void printUser(){
        for(User temp: userList){
            System.out.println(temp);
        }
    }

    public static void printUser(List<User> userList){
        for(User temp: userList){
            System.out.println(temp);
        }
    }

    public void printSortedByFirstName() {
        List<User> sortedUser = userList.stream()
                .sorted((user1, user2) -> user1.getFirstName().compareTo(user2.getFirstName()))
                .collect(Collectors.toList());
        printUser(sortedUser);
    }

    public void printSortedByAge() {
        List<User> sortedUser = userList.stream()
                .sorted((user1, user2) -> Integer.compare(user1.getAge(), user2.getAge()))
                .collect(Collectors.toList());
        printUser(sortedUser);
    }

    public void cheakAgeAboveSeven(){
        boolean allUsersAboveSeven = userList.stream()
                .allMatch(user -> user.getAge() > 7);

        if (allUsersAboveSeven) {
            System.out.println("Для всех пользователей age > 7");
        } else {
            System.out.println("Не для всех пользователей age > 7");
        }
    }

    public void averageAge(){
        double average = userList.stream()
                .mapToInt(user -> user.getAge())
                .average()
                .orElse(0.0);
        System.out.printf("Средний возраст всех пользователей: %.2f%n", average);
    }

    public void distinctCountry() {
        long distinct = userList.stream()
                .map(user -> user.getCountry())
                .distinct()
                .count();

        System.out.println("Количество различных стран: " + distinct);
    }
}
