package JavaByHerbertSchildt.Chapter09.DefaultInterfaceMethods;

/**
 * Created by ibakhtin on 08.03.17.
 */

public interface MyIF {
    int getNumber();
    default String getString() {
        return "Default String.";
    }
}
