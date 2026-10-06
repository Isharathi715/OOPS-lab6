public class EmployeeHRManager {
    public static void main(String[] args) {
        HRManager manager = new HRManager();
        manager.work();
        manager.getSalary();
        manager.addEmployee("Ravi");
    }
}
class Employee {
    void work() {
        System.out.println("Employee is working");
    }
    double getSalary() {
        double salary = 50000;
        System.out.println("Salary: " + salary);
        return salary;
    }
}
class HRManager extends Employee {
    @Override
    void work() {
        System.out.println("HR Manager is managing employees");
    }
    void addEmployee(String name) {
        System.out.println("Employee added: " + name);
    }
}
