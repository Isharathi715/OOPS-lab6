public class EmployeeSalary {
    public static void main(String[] args) {
        Employee manager = new Manager("Amit", 80000);
        Employee programmer = new Programmer("Neha", 60000);
        manager.displayInfo();
        System.out.println("Salary: " + manager.calculateSalary());
        programmer.displayInfo();
        System.out.println("Salary: " + programmer.calculateSalary());
    }
}
abstract class Employee {
    protected String name;
    protected double basicSalary;
    Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }
    abstract double calculateSalary();
    abstract void displayInfo();
}
class Manager extends Employee {
    Manager(String name, double basicSalary) { super(name, basicSalary); }
    double calculateSalary() { return basicSalary + basicSalary * 0.20; }
    void displayInfo() { System.out.println("Manager: " + name); }
}
class Programmer extends Employee {
    Programmer(String name, double basicSalary) { super(name, basicSalary); }
    double calculateSalary() { return basicSalary + basicSalary * 0.10; }
    void displayInfo() { System.out.println("Programmer: " + name); }
}
