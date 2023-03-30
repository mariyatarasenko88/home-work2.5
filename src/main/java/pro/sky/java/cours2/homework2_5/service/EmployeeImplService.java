package pro.sky.java.cours2.homework2_5.service;



import pro.sky.java.cours2.homework2_5.domain.Employee;

import java.util.Collection;

public interface EmployeeImplService {

    Employee addPerson(String firstName, String lastName);
    Employee removePerson(String firstName, String lastName);
    Employee findPerson(String firstName, String lastName);
    Collection<Employee> printAll();
}
