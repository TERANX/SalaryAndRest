package com.example.salaryandrest;

public class Employers {
    String name;
    int salary;
    int savings;



    public Employers(String name, int salary, int savings) {
        this.name = name;
        this.salary = salary;
        this.savings = savings;

    }
    @Override
    public String toString() {
        return "Employers{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", savings=" + savings +
                '}';
    }
}
