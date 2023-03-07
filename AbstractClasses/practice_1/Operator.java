import java.util.Random;

public class Operator implements Employee{
    private int salary = new Random().nextInt(60000, 100000);
    @Override
    public int getMonthSalary() {
        return salary;
    }
}
