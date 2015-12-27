package com.mytest;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;

import static org.junit.Assert.*;

/**
 * Created by shuran on 12/27/2015.
 */
public class EmployeeControllerTest {
    /*
    @Test
    public void shouldGetCountOfEmployees() {
        EmployeeController employeeController = new EmployeeController(new EmployeeService());
        Assert.assertEquals(10, employeeController.getProjectedEmployeeCount());
    }
    */
    @Test
    public void shouldReturnProjectedCountOfEmployeesFromTheService() {
        EmployeeService mock = PowerMockito.mock(EmployeeService.class);

        PowerMockito.when(mock.getEmployeeCount()).thenReturn(8);

        EmployeeController employeeController = new EmployeeController(mock);
        Assert.assertEquals(10, employeeController.getProjectedEmployeeCount());
    }
    /*
    @Test
    public void shouldInvokeSaveEmployeeOnTheServiceWhileSavingTheEmployee() {
        EmployeeService mock = PowerMockito.mock(EmployeeService.class);
        EmployeeController employeeController = new EmployeeController(mock);

        Employee employee = new Employee();
        employeeController.saveEmployee(employee);

        Mockito.verify(mock).saveEmployee(employee);
    }
    */
}