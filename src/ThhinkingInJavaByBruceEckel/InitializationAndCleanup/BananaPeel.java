package ThhinkingInJavaByBruceEckel.InitializationAndCleanup;

/**
 * Created by ibakhtin on 04.03.17.
 */

// BananaPeel class.

class Banana {
    void peel(int i) {

    }
}

public class BananaPeel {
    public static void main(String[] args) {
        Banana a = new Banana();
        Banana b = new Banana();
        a.peel(1);
        b.peel(2);
    }
}
