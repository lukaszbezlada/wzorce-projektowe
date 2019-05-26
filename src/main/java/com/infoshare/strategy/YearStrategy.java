package com.infoshare.strategy;

public class YearStrategy implements Strategy {
    @Override
    public int calculate(Employee employee) {
        return 10 * employee.getSalary();
    }
}
