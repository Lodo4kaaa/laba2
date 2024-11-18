package org.example.labs.User;

public class CreatorUserFactory implements UserFactory{
    @Override
    public User createUser(String fistName, String lastName, int age, String country) {
        if (fistName.isEmpty()) {
            throw new IllegalArgumentException("Имя не должно быть пустым");
        }
        if (lastName.isEmpty()) {
            throw new IllegalArgumentException("Фамилия не должны быть пустой");
        }
        if (age < 1 || age > 110) {
            throw new IllegalArgumentException("Возвраст должен быть в пределах от 1 до 110");
        }
        if (country.isEmpty()) { // Предположим, что оценки от 0.0 до 10.0
            throw new IllegalArgumentException("Страна не должна быть пустой");
        }

        return new User(fistName , lastName, age , country);
    }
}
