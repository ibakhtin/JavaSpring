package eu.bakhtin.corejava.chapter06.interfaces;

/**
 * @author Igor Bakkhtin
 */
public class Employee implements Comparable<Employee>
{
    private String name;
    private double salary;

    public Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public void riseSalary(double byPercent)
    {
        this.salary = this.salary + this.salary * (byPercent / 100);
    }

    @Override
    public int compareTo(Employee other)
    {
        if (this.getClass() != other.getClass()) throw new ClassCastException();

        return Double.compare(this.salary, other.salary);
    }
}
