package ThhinkingInJavaByBruceEckel.generics;

/**
 * @author ibakhtin
 */
public class Manipulator2<T extends HasF> {
    private T object;

    public Manipulator2(T object) {
        this.object = object;
    }

    public void manipulate() {
        object.f();
    }
}
