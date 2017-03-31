package eu.bakhtin.corejava.inheritance;

/**
 * Created by ibakhtin on 31.03.17.
 * @version
 * @author Igor Bakhtin
 */
public class ManagerTest {
    public static void main(String[] args) {
        Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        boss.setBonus(50000);

        Employee[] staff = new Employee[3];

        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tommy Tester", 40000, 1990, 3, 15);

        for (Employee employee : staff)
            System.out.println("name=\"" + employee.getName() + "\",salary=" + (int) employee.getSalary());
    }
}
