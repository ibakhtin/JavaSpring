package Miscelaneous.MultithreadedProgramming.JavaCourseRu;

/**
 * Created by ibakhtin on 11.03.17.
 */

public class SimpleThreadManager {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            SimpleThread simpleThread = new SimpleThread();
            simpleThread.start();
        }
    }
}
