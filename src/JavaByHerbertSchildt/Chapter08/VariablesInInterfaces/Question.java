package JavaByHerbertSchildt.Chapter08.VariablesInInterfaces;

import java.util.Random;

/**
 * Created by ibakhtin on 08.03.17.
 */

class Question implements SharedConstants {
    Random random = new Random();

    int ask() {
        int prob = (int) (100 * random.nextDouble());

        if (prob < 20)
            return NO;
        else if (prob < 40)
            return YES;
        else if (prob < 60)
            return MAYBE;
        else if (prob < 75)
            return LATER;
        else if (prob < 98)
            return SOON;
        else
            return NEVER;
    }
}
