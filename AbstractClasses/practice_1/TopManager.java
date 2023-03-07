import java.util.Random;

public class TopManager implements Employee{
    private int salary = new Random().nextInt(120000, 200000);
    private Company company;

    public TopManager(Company company) {
        this.company = company;
    }

    @Override
    public int getMonthSalary() {
        if (company.getIncome() > 10_000_000) {
            return (int) (salary * 2.5);
        }
        return salary;
    }
}
