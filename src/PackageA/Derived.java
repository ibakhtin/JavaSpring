package PackageA;

class Derived extends Protection {
    Derived() {
        System.out.println("derived constructor");
        System.out.println("num = " + num);

        // class only
        // System.out.println("numPrivate = " + numPrivate);

        System.out.println("numProtected = " + numProtected);
        System.out.println("numPublic = " + numPublic);
    }
}
