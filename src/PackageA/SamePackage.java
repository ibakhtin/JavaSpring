package PackageA;

class SamePackage {
    SamePackage() {
        Protection protection = new Protection();
        System.out.println("same package constructor");
        System.out.println("num = " + protection.num);

        // class only
        // System.out.println("numPrivate = " + protection.numPrivate);

        System.out.println("numProtected = " + protection.numProtected);
        System.out.println("numPublic = " + protection.numPublic);
    }
}