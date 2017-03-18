package javabyherbertschildt.chapter14.boundedwildcards;

/**
 * Created by ibakhtin on 16.03.17.
 */

// Bounded Wildcard arguments.

// Two-dimensional coordinates.
class TwoD {
    int x, y;

    TwoD(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

// Three-dimensional coordinates.
class ThreeD extends TwoD {
    int z;

    ThreeD(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}

// Four-dimensional coordinates.
class FourD extends ThreeD {
    int t;

    FourD(int x, int y, int z, int t) {
        super(x, y, z);
        this.t = t;
    }
}

// This class holds an array of coordinate objects.
class Coordinates<T extends TwoD> {
    T[] coordinates;

    Coordinates(T[] coordinates) {
        this.coordinates = coordinates;
    }
}

// Demonstrate a bounded wildcard.
public class BoundedWildcard {

    static void showXY(Coordinates<?> coordinates) {
        System.out.println("X Y Coordinates:");
        for (int i = 0; i < coordinates.coordinates.length; i++) {
            System.out.println(
                    coordinates.coordinates[i].x
                    + " " + coordinates.coordinates[i].y
            );
        }
        System.out.println();
    }

    static void showXYZ(Coordinates<? extends ThreeD> coordinates) {
        System.out.println("X Y Z Coordinates:");
        for (int i = 0; i < coordinates.coordinates.length; i++) {
            System.out.println(
                    coordinates.coordinates[i].x
                    + " " + coordinates.coordinates[i].y
                    + " " + coordinates.coordinates[i].z
            );
        }
        System.out.println();
    }

    static void showAll(Coordinates<? extends FourD> coordinates) {
        System.out.println("X Y Z T Coordinates:");
        for (int i = 0; i < coordinates.coordinates.length; i++) {
            System.out.println(
                    coordinates.coordinates[i].x
                    + " " + coordinates.coordinates[i].y
                    + " " + coordinates.coordinates[i].z
                    + " " + coordinates.coordinates[i].t
            );
        }
        System.out.println();
    }

    public static void main(String[] args) {

        TwoD[] twoD = {
                new TwoD(0, 0),
                new TwoD(7, 9),
                new TwoD(18, 4),
                new TwoD(-1, -23)
        };

        FourD[] fourD = {
                new FourD(1, 2, 3, 4),
                new FourD(6, 8, 10, 12),
                new FourD(2, 4, 8, 16),
                new FourD(-1, -1, -2, -3)
        };

        Coordinates<TwoD> twoDCoordinates = new Coordinates<TwoD>(twoD);

        System.out.println("Content of twoDCoordinates: ");

        showXY(twoDCoordinates);
        // showXYZ(twoDCoordinates);
        // showAll(twoDCoordinates);

        Coordinates<FourD> fourDCoordinates = new Coordinates<FourD>(fourD);

        System.out.println("Content of fourDCoordinates: ");

        showXY(fourDCoordinates);
        showXYZ(fourDCoordinates);
        showAll(fourDCoordinates);
    }
}
