package com.infoshare.strategy;

public class QuarterStrategy implements Strategy{

    @Override
    public int calculate(Employee employee) {
        return 5 * employee.getSalary();
    }

}
