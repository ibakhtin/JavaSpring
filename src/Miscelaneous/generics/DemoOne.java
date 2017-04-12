package Miscelaneous.generics;

/**
 * @author Igor Bakhtin, igor@bakhtin.eu
 */
public class DemoOne
{
    public static void main(String[] args)
    {
        Manager billGates = new Manager("Bill Gates", 50000, 20000);
        Manager steveJobs = new Manager("Steve Jobs", 40000, 20000);
        Pair<Manager> managerPair = new Pair<>(billGates, steveJobs);
        printBuddies(managerPair);
    }

    static void printBuddies(Pair<? extends Employee> employeePair)
    {
        Employee first = employeePair.getFirst();
        Employee second = employeePair.getSecond();
        System.out.printf("first: %s\nsecond: %s\n", first, second);
    }
}
