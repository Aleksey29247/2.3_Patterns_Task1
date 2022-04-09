package ru.netology;

import com.github.javafaker.Faker;

import lombok.Data;
import lombok.Value;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@Data


public class DataGenerator {
       private DataGenerator() {
    }

    private static Faker faker = new Faker(new Locale("ru"));


    public String generateDate(int days) {
       return LocalDate.now().plusDays(days).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        // TODO: добавить логику для объявления переменной date и задания её значения, для генерации строки с датой
        // Вы можете использовать класс LocalDate и его методы для получения и форматирования даты

    }

    public static String generateCity(String locale) {
        String[] citis = {"Москва", "Калуга", "Абакан", "Владикавказ", "Воронеж", "Пермь", "Екатеринбург", "Ульяновск"};
        int n = (int) Math.floor(Math.random() * citis.length);
        String city = citis[n];
        return city;
        // TODO: добавить логику для объявления переменной city и задания её значения, генерацию можно выполнить
        // с помощью Faker, либо используя массив валидных городов и класс Random

    }

    public static String generateName(String locale) {
        String name = faker.name().fullName();
        return name;
        // TODO: добавить логику для объявления переменной name и задания её значения, для генерации можно
        // использовать Faker

    }

    public static String generatePhone(String locale) {
        String phone = faker.name().fullName();
        return phone;
        // TODO: добавить логику для объявления переменной phone и задания её значения, для генерации можно
        // использовать Faker

    }

    public static class Registration {
        private Registration() {
        }

        public static UserInfo generateUser(String locale) {
            UserInfo user = new UserInfo(generateCity(locale), generateName(locale), generatePhone(locale));
            return user;
            // TODO: добавить логику для создания пользователя user с использованием методов generateCity(locale),
            // generateName(locale), generatePhone(locale)

        }
    }

    @Value
    public static class UserInfo {
        String city;
        String name;
        String phone;
    }
}