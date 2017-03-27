package javabyherbertschildt.chapter19.timerandtimertask;

// Demonstrate Timer and TimerTask.

import java.util.Timer;
import java.util.TimerTask;

class SomeTimerTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("Timer task executed.");
    }
}

public class TimerAndTimerTaskDemo {
    public static void main(String[] args) {
        SomeTimerTask someTimerTask = new SomeTimerTask();
        Timer someTimer = new Timer();

        someTimer.schedule(someTimerTask, 1000, 500);

        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e) {
            System.out.println("Sleep interrupted.");
        }

        someTimer.cancel();
    }
}
