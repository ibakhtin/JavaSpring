package JavaByHerbertSchildt.Chapter08.DefaultInterfaceMethods;

/**
 * Created by ibakhtin on 08.03.17.
 */

// Demonstrate the default method.

public class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFImp obj = new MyIFImp();
        MyIFImp2 obj2 = new MyIFImp2();

        System.out.println(obj.getNumber());
        System.out.println(obj.getString());

        System.out.println(obj2.getNumber());
        System.out.println(obj2.getString());
    }
}
