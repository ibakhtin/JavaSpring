package javabyherbertschildt.chapter19.observer;

// Demonstrate the Observable class and
// the Observer interface.

import java.util.Observable;
import java.util.Observer;

// This is the observing class.
class Watcher implements Observer {
    public void update(Observable object, Object argument) {
        // System.out.println("update() called, count is " + ((Integer) argument).intValue());
        System.out.println("update() called, count is " + argument);
    }
}

class BeingWatched extends Observable {
    void counter(int perion) {
        for (; perion >= 0; perion--) {
            setChanged();
            // notifyObservers(new Integer(perion));
            notifyObservers(perion);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Sleep interrupted.");
            }
        }
    }
}

public class ObserverDemo {
    public static void main(String[] args) {
        BeingWatched observed = new BeingWatched();
        Watcher observing = new Watcher();

        // Add the observing to the list of observers for observed object.
        observed.addObserver(observing);

        observed.counter(10);
    }
}
