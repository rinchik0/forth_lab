package org.example;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class CsvReader {
    private static final char separator = ';';
    public ArrayList<Person> read(String csvFilePath) throws IOException {
        ArrayList<Person> list = new ArrayList<>();
        // 1. Создаем парсер с указанием разделителя
        CSVParser parser = new CSVParserBuilder()
                .withSeparator(separator)
                .build();
        // 2. Открываем файл и создаем reader
        try (Reader reader = new InputStreamReader(
                new FileInputStream(csvFilePath), StandardCharsets.UTF_8);
             CSVReader csvReader = new CSVReaderBuilder(reader)
                     .withCSVParser(parser)
                     .build()) {
            // 3. Читаем файл построчно
            String[] line;
            while ((line = csvReader.readNext()) != null) {
            }
        } catch (CsvValidationException e) {
            throw new IOException("Ошибка валидации CSV", e);
        }
        return list;
    }
}
