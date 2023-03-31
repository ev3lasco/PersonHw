package Person;

public class SalaryEmployee extends Person{
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(String name, double salary) {
        System.out.println("Hello " + name + "your weekly pay is " + "\n" + salary);
        this.salary = salary;
    }
}
