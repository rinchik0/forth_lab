package org.example.Entities;

import org.example.Enums.Gender;

import java.util.Date;

/**
 * Класс-сущность человек.
 */
public class Person {
    private int ID;
    private String name;
    private Gender gender;
    private Date birthDate;
    private Department department;
    private double salary;

    /**
     * Пустой конструктор.
     */
    public Person() {}

    /**
     * Конструктор со всеми параметрами.
     * @param ID идентификатор
     * @param name имя
     * @param gender пол
     * @param birthDate дата рождения
     * @param department отдел
     * @param salary заработная плата
     */
    public Person(int ID, String name, Gender gender, Date birthDate, Department department, double salary) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.department = department;
        this.salary = salary;
    }

    /**
     * Сеттер идентификатора.
     * @param ID идентификатор
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * Сеттер имени.
     * @param name имя
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Сеттер даты рождения
     * @param birthDate дата
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * Сеттер отдела.
     * @param department отдел
     */
    public void setDepartment(Department department) {
        this.department = department;
    }

    /**
     * Сеттер пола.
     * @param gender пол
     */
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    /**
     * Сеттер заработной платы.
     * @param salary сумма
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Переопределенный метод, возвращающий строку с информацией о человек.
     * @return строка
     */
    @Override
    public String toString() {
        String result = "";
        result += ("ID: " + ID + '\n');
        result += ("Name: " + name + '\n');
        switch (gender) {
            case Male: { result += "Gender: Male\n"; } break;
            case Female: { result += "Gender: Female\n"; } break;
        }
        result += ("Birth date: " + birthDate.toString() + '\n');
        result += ("Department: " + department.toString() + '\n');
        result += ("Salary: " + salary);
        return result;
    }

    /**
     * Переопределенный метод, проверяющий, равны ли два объекта класса Person.
     * @param o второй объект
     * @return true, если объекты равны, false - в обратном случае
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person that = (Person) o;
        return ID == that.ID && name.equals(that.name) && gender == that.gender && birthDate.equals(that.birthDate) &&
                department.equals(that.department) && salary == that.salary;
    }
}
