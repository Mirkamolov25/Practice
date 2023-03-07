import java.util.Random;

public class Manager implements Employee{
    private int salary = new Random().nextInt(100000, 120000);
    private int sales;
    Random random = new Random();

    public Manager() {
        sales = random.nextInt(115000, 140000);
        salary += sales*0.05;
    }

    @Override
    public int getMonthSalary() {
        return salary;
    }
}
