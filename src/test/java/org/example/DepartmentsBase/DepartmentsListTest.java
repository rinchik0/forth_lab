package org.example.DepartmentsBase;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentsListTest {
    @Test
    void nameOfID() {
        DepartmentsList list = new DepartmentsList();
        String actual = list.nameOfID('A');
        String expected = "Administration";
        Assertions.assertEquals(expected, actual);
    }
}