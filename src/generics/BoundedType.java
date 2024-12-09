package generics;

import models.Employee;

public class BoundedType <T extends Employee> {
    private T employee;
    public BoundedType(T employee) {
        this.employee = employee;
    }

    public T getEmployee() {
        return employee;
    }

    public void setEmployee(T employee) {
        this.employee = employee;
    }

    public String displayEmployeeDetails(){
        return employee.toString();
    }

}
