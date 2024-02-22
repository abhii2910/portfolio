package employeemanagementsystem;

import java.util.ArrayList;

public class EmployeeManagementSystem {

    private ArrayList<Employee> employees;

    public EmployeeManagementSystem() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void deleteEmployee(int employeeId) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getEmployeeId() == employeeId) {
                employees.remove(i);
                break;
            }
        }
    }

    public Employee getEmployeeById(int employeeId) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId() == employeeId) {
                return employee;
            }
        }
        return null;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public static void main(String[] args) {
        EmployeeManagementSystem employeeManagementSystem = new EmployeeManagementSystem();
        employeeManagementSystem.addEmployee(new Employee(1, "John Doe", "john.doe@example.com", 30000));
        employeeManagementSystem.addEmployee(new Employee(2, "Jane Doe", "jane.doe@example.com", 40000));

        System.out.println("Employees:");
        for (Employee employee : employeeManagementSystem.getEmployees()) {
            System.out.println(employee);
        }

        System.out.println("Deleting employee with ID 1");
        employeeManagementSystem.deleteEmployee(1);

        System.out.println("Employees:");
        for (Employee employee : employeeManagementSystem.getEmployees()) {
            System.out.println(employee);
        }
    }
}

class Employee {

    private int employeeId;
    private String name;
    private String email;
    private double salary;

    public Employee(int employeeId, String name, String email, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", name=" + name + ", email=" + email + ", salary=" + salary + "]";
    }
}
