package PackageB;

public class Protection2 extends PackageA.Protection {
    Protection2() {
        System.out.println("derived other package constructor");

        //class of package only
        // System.out.println("num = " + num);

        // class only
        // System.out.println("numPrivate = " + numPrivate);

        System.out.println("numProtected = " + numProtected);
        System.out.println("numPublic = " + numPublic);
    }
}
