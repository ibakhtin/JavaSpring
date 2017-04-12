package Miscelaneous.generics;

/**
 * @author Igor Bakhtin. igor@bakhtin.eu
 */
public class Manager extends Employee
{

    double bonus;

    public Manager(String name, double salary, double bonus)
    {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus()
    {
        return bonus;
    }

    public void setBonus(double bonus)
    {
        this.bonus = bonus;
    }

    @Override
    public String toString()
    {
        return "Employee{" +
                "name='" + super.getName() + '\'' +
                ", salary=" + super.getSalary() +
                ", bonus=" + this.getBonus() +
                '}';
    }
}
