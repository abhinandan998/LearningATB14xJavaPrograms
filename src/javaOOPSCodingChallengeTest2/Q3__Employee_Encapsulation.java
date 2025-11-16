package javaOOPSCodingChallengeTest2;

//Implement encapsulation in a class "Employee"
// with private attributes "id", "name", and "salary". Add getter and setter methods.
//Input:
//Employee with id=1, name="John Doe", salary=50000
//Output:
//Employee ID: 1 Employee Name: John Doe Employee Salary: 50000.0
public class Q3__Employee_Encapsulation {
    static void main(String[] args) {


        Employee emp = new Employee(1, "John Doe", 50000.0);
        emp.printDetails();
    }

}
class Employee
{
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}
