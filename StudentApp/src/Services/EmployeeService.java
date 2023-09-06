package Services;

import java.util.ArrayList;
import java.util.List;

import Domen.Employee;
import Domen.PersonComparator;

public class EmployeeService implements iPersonService<Employee> {

    private List<Employee> employees;

    public EmployeeService() {
        this.employees = new ArrayList<>();
    }

    @Override
    public List<Employee> getAll() {
        return employees;
    }

    @Override
    public void create(String name, int age) {
        Employee epls = new Employee(name, age, "basic");
        employees.add(epls);
    }

    public void sortByFIO() {
        PersonComparator<Employee> persComp = new PersonComparator<Employee>();
        employees.sort(persComp);
    }

}