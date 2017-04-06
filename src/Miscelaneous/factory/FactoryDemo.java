package Miscelaneous.factory;

/**
 * @author Igor Bakhtin
 */
public class FactoryDemo
{
    public static void main(String[] args)
    {
        Point point = Point.create(10, 10);
        System.out.println(point);
    }
}

/**
 * @author Igor Bakhtin
 */
class Point
{
    private final int x;
    private final int y;

    /**
     * Private constructor
     * @param x coordinate
     * @param y coordinate
     */
    private Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    /**
     * Factory method.
     * @param x coordinate
     * @param y coordinate
     * @return new instance of Point class.
     */
    public static Point create(int x, int y)
    {
        return new Point(x, y);
    }

    /**
     *
     * @return String presentation of instance of Point class.
     */
    @Override
    public String toString()
    {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
