package PackageA;

public class Protection {
    int num = 1;
    private int numPrivate = 2;
    protected int numProtected = 3;
    public int numPublic = 4;

    public Protection() {
        System.out.println("base constructor");
        System.out.println("num = " + num);
        System.out.println("numPrivate = " + numPrivate);
        System.out.println("numProtected = " + numProtected);
        System.out.println("numPublic = " + numPublic);
    }
}
