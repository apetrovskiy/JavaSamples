package com.mytest;

/**
 * Created by shuran on 12/27/2015.
 */
public class EmployeeController {
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public int getProjectedEmployeeCount() {
        final int actualEmployeeCount = employeeService.getEmployeeCount();
        return (int)Math.ceil(actualEmployeeCount * 1.2);
    }

    public void saveEmployee(Employee employee) {

    }
}
