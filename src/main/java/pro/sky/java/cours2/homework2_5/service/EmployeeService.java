package pro.sky.java.cours2.homework2_5.service;

import org.springframework.stereotype.Service;
import pro.sky.java.cours2.homework2_5.domain.Employee;
import pro.sky.java.cours2.homework2_5.exception.EmployeeAlreadyAddedException;
import pro.sky.java.cours2.homework2_5.exception.EmployeeNotFoundException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class EmployeeService implements EmployeeImplService {
    private final List<Employee> employeeList;

    public EmployeeService() {
        this.employeeList = new ArrayList<>();
    }


    @Override
    public Employee addPerson(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employeeList.contains(employee)) {
            throw new EmployeeAlreadyAddedException();
        }
        employeeList.add(employee);
        return employee;
    }
    @Override
    public Employee removePerson(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employeeList.contains(employee)) {
            throw new EmployeeNotFoundException();
        }
        employeeList.remove(employee);
        return employee;
    }
    @Override
    public Employee findPerson(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employeeList.contains(employee)) {
            throw new EmployeeNotFoundException();
        }
        return employee;
    }
    @Override
    public Collection<Employee> printAll(){
        return Collections.unmodifiableList(employeeList);
    }
}

