package org.example.Entities;

import org.example.DepartmentsBase.DepartmentsList;

public class Department {
    private char ID;
    private String name;
    private static DepartmentsList departments;
    public Department(char id) {
        if (departments == null) {
            departments = new DepartmentsList();
        }
        ID = id;
        name = departments.nameOfID(id);
    }
    @Override
    public String toString() {
        String result = "";
        result += ("Department ID: " + ID + '\n');
        result += ("Department name: " + name);
        return result;
    }
}
