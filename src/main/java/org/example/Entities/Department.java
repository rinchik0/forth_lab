package org.example.Entities;

import org.example.DepartmentsBase.DepartmentsList;

/**
 * Класс-сущность подразделение (отдел).
 */
public class Department {
    private char ID;
    private String name;
    /**
     * Список отделов.
     */
    private static DepartmentsList departments;

    /**
     * Конструктор. Если еще не существует списка отделов, создает его.
     * @param id идентификатор отдела
     */
    public Department(char id) {
        if (departments == null) {
            departments = new DepartmentsList();
        }
        ID = id;
        name = departments.nameOfID(id);
    }

    /**
     * Переопределенный метод, возвращающий строку с информацией об отделе.
     * @return строка
     */
    @Override
    public String toString() {
        String result = "";
        result += ("Department ID: " + ID + '\n');
        result += ("Department name: " + name);
        return result;
    }

    /**
     * Переопределнный метод, проверяющий, равны ли два объекта класса Department.
     * @param o второй объект
     * @return true, если объекты равны, false - в обратном случае
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return ID == that.ID;
    }
}
