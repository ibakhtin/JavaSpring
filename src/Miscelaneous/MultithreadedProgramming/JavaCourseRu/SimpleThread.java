package Miscelaneous.MultithreadedProgramming.JavaCourseRu;

/**
 * Created by ibakhtin on 11.03.17.
 */
class SimpleThread extends Thread {

    @Override
    public void run() {
        try {
            long pause = Math.round(Math.random() * 5000);
            Thread.sleep(pause);
            System.out.println("Simple thread - pause = " + pause);
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
