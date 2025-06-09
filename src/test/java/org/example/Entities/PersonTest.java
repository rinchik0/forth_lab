package org.example.Entities;

import org.example.Enums.Gender;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

class PersonTest {
    @Test
    public void toStringTest() {
        Person person = new Person(100, "Test", Gender.Male, new Date(100,10,10),
                new Department('Z'), 10000.10);
        String actual = person.toString();
        String expected = "ID: 100\nName: Test\nGender: Male\nBirth date: " + new Date(100,10,10).toString() +
                "\nDepartment: " + new Department('Z').toString() + "\nSalary: 10000.1";
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void equalsTest() {
        Person person1 = new Person(100, "Test", Gender.Male, new Date(100,10,10),
                new Department('Z'), 10000.10);
        Person person2 = new Person(100, "Test", Gender.Male, new Date(100,10,10),
                new Department('Z'), 10000.10);
        Person person3 = new Person(1000, "Test", Gender.Male, new Date(100,10,10),
                new Department('Z'), 10000.10);
        Assertions.assertTrue(person1.equals(person2));
        Assertions.assertFalse(person1.equals(person3));
    }
}