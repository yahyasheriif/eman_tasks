
import java.util.ArrayList;

public class EmployeeManager {
    private ArrayList<Employee> employees;

    public EmployeeManager() {
        employees = new ArrayList<>();
    }

    public void add(Employee employee) {
        employees.add(employee);
    }

    public void remove(int empNumber) {
        employees.removeIf(emp -> emp.getEmpNumber() == empNumber);
    }

    public void set(int empNumber, float newSalary) {
        for (Employee emp : employees) {
            if (emp.getEmpNumber() == empNumber) {
                emp.setEmpSalary(newSalary);
                break;
            }
        }
    }

    public void clear() {
        employees.clear();
    }

    public void displayAllEmployees() {
        for (Employee emp : employees) {
            emp.displayData();
            System.out.println("-------------------------");
        }
    }
}