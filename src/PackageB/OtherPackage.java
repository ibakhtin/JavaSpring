package PackageB;

public class OtherPackage {
    OtherPackage() {
        PackageA.Protection protection = new PackageA.Protection();

        System.out.println("other package constructor");

        //class of package only
        // System.out.println("num = " + protection.num);

        // class only
        // System.out.println("numPrivate = " + protection.numPrivate);

        // class, subclass or package only
        // System.out.println("numProtected = " + protection.numProtected);

        System.out.println("numPublic = " + protection.numPublic);

    }

}
