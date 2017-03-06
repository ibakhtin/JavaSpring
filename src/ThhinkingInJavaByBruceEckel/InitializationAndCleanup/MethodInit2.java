package ThhinkingInJavaByBruceEckel.InitializationAndCleanup;

/**
 * Created by ibakhtin on 06.03.17.
 */

// MethodInit2 class.

public class MethodInit2 {
    int i = f();
    int j = g(i);
    int f() { return 11; };
    int g(int n) { return n * 10; };
}
