package Miscelaneous.MultithreadedProgramming.SimpleExample;

/**
 * Created by ibakhtin on 11.03.17.
 */

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("o_O");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("O_o");
    }
}

public class SimpleThread {
    public static void main(String[] args) {
        new Thread(new MyRunnable()).start();
        new MyThread().start();
    }
}
