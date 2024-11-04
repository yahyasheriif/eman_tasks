import java.util.Scanner;

public class Employee {
    private int empNumber;
    private float empSalary;

    public Employee() {
        this.empNumber = 0;
        this.empSalary = 0.0f;
    }

    public Employee(int empNumber, float empSalary) {
        this.empNumber = empNumber;
        this.empSalary = empSalary;
    }

    public int getEmpNumber() {
        return empNumber;
    }

    public float getEmpSalary() {
        return empSalary;
    }

    public void setEmpNumber(int empNumber) {
        this.empNumber = empNumber;
    }

    public void setEmpSalary(float empSalary) {
        this.empSalary = empSalary;
    }

    public void enterData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee number: ");
        this.empNumber = scanner.nextInt();
        System.out.print("Enter employee salary: ");
        this.empSalary = scanner.nextFloat();
        scanner.close();
    }

    public void displayData() {
        System.out.println("Employee Number: " + empNumber);
        System.out.println("Employee Salary: " + empSalary);
    }
}