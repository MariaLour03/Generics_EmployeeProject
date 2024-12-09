import generics.BoundedType;
import interfaces.GenericInterface;
import interfaces.impl.GenericInterfaceImpl;
import models.Employee;
import models.SalariedEmployee;

public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee(1, "John Doe");
        System.out.println("Employee Details: " + emp1);
        SalariedEmployee salEmp = new SalariedEmployee(2, "Jane Smith", 85000.0);
        System.out.println("Employee Details: " + salEmp);
        BoundedType <Employee> boundedTypeEmp = new BoundedType<>(emp1);
        System.out.println("Value: " + boundedTypeEmp.displayEmployeeDetails());
        BoundedType<SalariedEmployee> boundedTypeSalEmp = new BoundedType<>(salEmp);
        System.out.println("Value: " + boundedTypeSalEmp.displayEmployeeDetails());
        GenericInterface <Employee> emp3Impl = new GenericInterfaceImpl<>();
        GenericInterface <SalariedEmployee> empSalEmp = new GenericInterfaceImpl<>();

        System.out.println("Printing list of Employees: ");
        emp3Impl.print(emp1);
        empSalEmp.print(salEmp);

    }
}