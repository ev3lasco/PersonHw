package Person;

public class HourlyEmployee {
    private int hoursWorked;
    private int rate;

    public int getHoursWorked() {
        return hoursWorked;
    }

    public int getRate() {
        return rate;
    }

    public void Hourlypayment(String name, int hoursWorked, int rate) {
        System.out.println("Hello!" + name + "\n" + "Here is your pay!" + "\n" +hoursWorked * rate);
    }


}

