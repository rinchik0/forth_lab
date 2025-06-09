package org.example;

import org.example.Entities.Department;
import org.example.Entities.Person;
import org.example.Enums.Gender;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class CsvReaderTest {
    @Test
    public void parsePerson() {
        CsvReader reader = new CsvReader();
        String[] personString = {"1", "Martin", "Male", "31.12.1980", "D", "320000.45"};
        Person actual = reader.parsePerson(personString);
        Person expected = new Person(1, "Martin", Gender.Male, new Date(80, 11,31),
                new Department('D'), 320000.45);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void read() {
        CsvReader reader = new CsvReader();
        List<Person> actual = new ArrayList<>();
        try {
            actual = reader.read("src/main/resources/test.csv");
        }
        catch (IOException e) {
            System.out.println("There is no file with this name!");
        }
        List<Person> expected = new ArrayList<>();
        expected.add(new Person(1, "Ariadna", Gender.Female, new Date(104, 9, 2),
                new Department('A'), 15000));
        expected.add(new Person(2, "Ellina", Gender.Female, new Date(104, 0, 26),
                new Department('B'), 50000));
        expected.add(new Person(3, "Dmitry", Gender.Male, new Date(104, 7, 30),
                new Department('C'), 3000));
        expected.add(new Person(4, "Michael", Gender.Male, new Date(103, 8, 23),
                new Department('D'), 30000));
        expected.add(new Person(5, "Makar", Gender.Male, new Date(103, 4, 16),
                new Department('E'), 10000));
        expected.add(new Person(6, "Daria", Gender.Female, new Date(104, 8, 15),
                new Department('F'), 100));
        expected.add(new Person(7, "Vladimir", Gender.Male, new Date(100, 11, 9),
            new Department('J'),120000));
        expected.add(new Person(8, "Daniel", Gender.Male, new Date(103, 8, 24),
                new Department('H'), 20000));
        expected.add(new Person(9, "Yuri", Gender.Male, new Date(102, 5, 7),
                new Department('I'), 1000));
        expected.add(new Person(10, "Ekaterina", Gender.Female, new Date(102, 0, 29),
                new Department('J'), 16000));
        Assertions.assertEquals(expected, actual);
    }
}