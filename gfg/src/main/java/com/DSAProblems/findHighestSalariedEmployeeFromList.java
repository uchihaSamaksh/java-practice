package main.java.com.DSAProblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class findHighestSalariedEmployeeFromList {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee("John", 100000), new Employee("Jane", 120000), new Employee("Jim", 110000));
        Employee highestSalariedEmployee = employees.stream().max((e1,e2) -> e1.salary - e2.salary).get();
        System.out.println(highestSalariedEmployee.name);
    }

    class Employee {
        String name;
        int salary;

        public Employee(String name, int salary) {
            this.name = name;
            this.salary = salary;
        }
    }
}
