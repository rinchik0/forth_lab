package org.example;

import org.example.Entities.Person;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CsvReader reader = new CsvReader();
        try {
            List<Person> persons = reader.read("src/main/resources/foreign_names.csv");
            for (var person : persons) {
                System.out.println(person.toString());
                System.out.println();
            }
        }
        catch (IOException e) {
            System.out.println("There is no file with this name!");
        }
    }
}