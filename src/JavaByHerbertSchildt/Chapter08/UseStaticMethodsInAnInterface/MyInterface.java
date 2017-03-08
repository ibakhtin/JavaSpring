package JavaByHerbertSchildt.Chapter08.UseStaticMethodsInAnInterface;

/**
 * Created by ibakhtin on 08.03.17.
 */

// Interface with static method.

public interface MyInterface {
    static int getDefaultNumber() {
        return 1024;
    }
}
