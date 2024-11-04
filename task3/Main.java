public class  Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();


        Employee emp1 = new Employee(1, 2005f);
        Employee emp2 = new Employee(2, 2003f);
        manager.add(emp1);
        manager.add(emp2);


        System.out.println("All Employees:");
        manager.displayAllEmployees();


        manager.set(1, 550f);


        manager.remove(2);


        System.out.println("After Update and Removal:");
        manager.displayAllEmployees();


        manager.clear();
        System.out.println("After Clearing All Employees:");
        manager.displayAllEmployees();
    }
}