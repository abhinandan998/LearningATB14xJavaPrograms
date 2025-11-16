package javaOOPSCodingChallengeTest2;

//Create an Employee base class and Manager, Developer subclasses.
// Each should have different salary calculation methods.
//Input:
//Manager with base salary 60000 and bonus 10000,
// Developer with hourly rate 50 and 160 hours
//Output:
//Manager Salary: 70000.0 Developer Salary: 8000.0
public class Q7__Employee_Hierarchy_with_Salary_Calculation {
    static void main(String[] args) {
        Manager manager = new Manager(60000, 10000);
        Developer developer = new Developer(50, 160);

        System.out.println("Manager Salary: " + manager.calculateSalary());
        System.out.println("Developer Salary: " + developer.calculateSalary());
    }
}
//base employee class
abstract class Employee1
{
    public abstract double calculateSalary();

}
class Manager extends Employee1
{
    private double baseSalary;
    private double bonus;

    public Manager(double baseSalary, double bonus)
    {
        this.baseSalary=baseSalary;
        this.bonus=bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}
class Developer extends Employee1
{
    private double hourlyRate;
    private double hoursWorked;

    public Developer(double hourlyRate, double hoursWorked)
    {
        this.hourlyRate=hourlyRate;
        this.hoursWorked=hoursWorked;
    }


    @Override
    public double calculateSalary() {
        return hourlyRate*hoursWorked;
    }
}

