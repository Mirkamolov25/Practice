import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        ArrayList<Employee> workers = new ArrayList<>();
        for (int i = 0; i < 180; i++) {
            company.hire(new Operator());
        }
        for (int i = 0; i < 80; i++) {
            workers.add(new Manager());
        }
        for (int i = 0; i < 10; i++) {
            workers.add(new TopManager(company));
        }
        company.hireAll(workers);
        System.out.println("10 самых высоких зарплат: ");
        List<Employee> topSalaryStaff = company.getTopSalaryStaff(10);
        for (Employee e : topSalaryStaff) {
            System.out.println(e.getMonthSalary() + " руб.");
        }
        System.out.println("30 самых низких зарплат: ");
        List<Employee> lowestSalaryStaff = company.getLowestSalaryStaff(30);
        for (Employee e : lowestSalaryStaff) {
            System.out.println(e.getMonthSalary() + " руб.");
        }
        System.out.println("Уволили 50% сотрудников.");
        for (int i = 0; i < company.employees.size() / 2; i++) {
            company.fire(company.employees.get(i));
        }
        System.out.println("10 самых высоких зарплат: ");
        topSalaryStaff = company.getTopSalaryStaff(10);
        for (Employee e : topSalaryStaff) {
            System.out.println(e.getMonthSalary() + " руб.");
        }
        System.out.println("30 самых низких зарплат: ");
        lowestSalaryStaff = company.getTopSalaryStaff(30);
        for (Employee e : lowestSalaryStaff) {
            System.out.println(e.getMonthSalary() + " руб.");
        }
    }
}
