import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company{
    public int income = 11_000_000;
    public int getIncome() {
        return income;
    }
    List<Employee> employees = new ArrayList<>();
    public void hire(Employee employee) {
        employees.add(employee);
    }
    public void hireAll(List<Employee> employeeList) {
        for (Employee employee : employeeList) {
            hire(employee);
        }
    }
    public void fire(Employee employee) {
        employees.remove(employee);
    }

    public List<Employee> getTopSalaryStaff(int count) {
        Collections.reverse(employees);
        ArrayList<Employee> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            result.add(employees.get(i));
        }
        return result;
    }
    public List<Employee> getLowestSalaryStaff(int count) {
        Collections.sort(employees);
        ArrayList<Employee> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            result.add(employees.get(i));
        }
        return result;
    }

}
