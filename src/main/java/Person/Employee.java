package Person;

public class Employee extends Person {
    private double id;
    private int hoursWorked;
    private int rate;

    public int getHoursWorked() {
        return hoursWorked;
    }

    public int getRate() {
        return rate;
    }

    public void calculatepay(int hoursWorked, int rate) {
        System.out.println(hoursWorked * rate);

    }
}


