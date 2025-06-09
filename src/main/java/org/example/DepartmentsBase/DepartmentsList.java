package org.example.DepartmentsBase;

import java.util.HashMap;
import java.util.Map;

/**
 * Класс, играющий в данном тестовом коде роль класса базы данных.
 * Хранит в себе информацию об идентификаторах и названиях отделов.
 */
public class DepartmentsList {
    private Map<Character, String> departments;

    /**
     * Конструктор. Генерирует названия отделов.
     */
    public DepartmentsList() {
        departments = new HashMap<>();
        departments.put('A', "Administration");
        departments.put('B', "Billing");
        departments.put('C', "Customer Support");
        departments.put('D', "Development");
        departments.put('E', "Engineering");
        departments.put('F', "Finance");
        departments.put('G', "Graphics");
        departments.put('H', "Human Resources");
        departments.put('I', "IT Services");
        departments.put('J', "Legal");
        departments.put('K', "Quality Control");
        departments.put('L', "Logistics");
        departments.put('M', "Marketing");
        departments.put('N', "Networking");
        departments.put('O', "Operations");
        departments.put('P', "Production");
        departments.put('Q', "Quality Assurance");
        departments.put('R', "Sales");
        departments.put('S', "Security");
        departments.put('T', "Technical Support");
        departments.put('U', "User Experience");
        departments.put('V', "Vendor Management");
        departments.put('W', "Warehouse");
        departments.put('X', "Executive Office");
        departments.put('Y', "Business Analytics");
        departments.put('Z', "Corporate Headquarters");
    }

    /**
     * Метод, возвращающий название отдела по его идентификатору.
     * @param id идентификатор отдела
     * @return название отдела
     */
    public String nameOfID(Character id) {
        return departments.get(id);
    }
}