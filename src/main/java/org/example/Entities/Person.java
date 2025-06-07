package org.example.Entities;

import org.example.Enums.Gender;

import java.util.Date;

public class Person {
    private int ID;
    private String name;
    private Gender gender;
    private Date birthDate;
    private Department department;
    private double salary;

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

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
}
