package JavaByHerbertSchildt.Chapter11.UsingSynchronizedMethod;

/**
 * Created by ibakhtin on 11.03.17.
 */

class CallMe {
    synchronized void call (String msg) {
        System.out.print("[" + msg);

        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            System.out.println("interrupted");
        }

        System.out.println("]");
    }
}
