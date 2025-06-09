package org.example.Entities;

import org.example.Enums.Gender;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentTest {
    @Test
    void testToString() {
        Department department = new Department('A');
        String actual = department.toString();
        String expected = "Department ID: A\nDepartment name: Administration";
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void equalsTest() {
        Department department1 = new Department('A');
        Department department2 = new Department('A');
        Department department3 = new Department('B');
        Assertions.assertTrue(department1.equals(department2));
        Assertions.assertFalse(department1.equals(department3));
    }
}