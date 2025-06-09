package org.example;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;
import org.example.Entities.Department;
import org.example.Entities.Person;
import org.example.Enums.Gender;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Класс для чтения людей из csv-файла.
 */
public class CsvReader {
    private static final char separator = ';';

    /**
     * Метод парсинга человека из массива строк.
     * @param line строго определенного формата массив строк
     * @return человек
     */
    public Person parsePerson(String[] line) {
        Person person = new Person();
        person.setID(Integer.parseInt(line[0]));
        person.setName(line[1]);
        switch (line[2]) {
            case "Male": { person.setGender(Gender.Male); } break;
            case "Female": { person.setGender(Gender.Female); } break;
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate localDate = LocalDate.parse(line[3], formatter);
        person.setBirthDate(Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant()));
        person.setDepartment(new Department(line[4].charAt(0)));
        person.setSalary(Double.parseDouble(line[5]));
        return person;
    }

    /**
     * Метод, считывающий информацию о людях из файла и формирующий из них список.
     * @param csvFilePath название файла
     * @return список людей
     * @throws IOException возникает, если не удается открыть указанный файл
     */
    public List<Person> read(String csvFilePath) throws IOException {
        List<Person> list = new ArrayList<>();
        // Создаем парсер с указанием разделителя
        CSVParser parser = new CSVParserBuilder()
                .withSeparator(separator)
                .build();
        // Открываем файл и создаем reader
        try (Reader reader = new InputStreamReader(
                new FileInputStream(csvFilePath), StandardCharsets.UTF_8);
             CSVReader csvReader = new CSVReaderBuilder(reader)
                     .withCSVParser(parser)
                     .build()) {
            // Читаем файл построчно
            String[] line;
            // Пропускаем первую строку
            line = csvReader.readNext();
            while ((line = csvReader.readNext()) != null)
                list.add(parsePerson(line));
        } catch (CsvValidationException e) {
            throw new IOException("Ошибка валидации CSV", e);
        }
        return list;
    }
}
