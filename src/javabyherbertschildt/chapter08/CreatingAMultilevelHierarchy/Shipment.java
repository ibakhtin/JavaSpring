package javabyherbertschildt.chapter08.CreatingAMultilevelHierarchy;

/**
 * Created by ibakhtin on 07.03.17.
 */

// Shipment class.

public class Shipment extends BoxWeight {
    double cost;

    // construct clone of an object
    Shipment(Shipment obj) {
        super(obj);
        cost = obj.cost;
    }

    //constructor when all parameters are specified
    Shipment(double w, double h,
             double d, double m, double c) {
        super(w, h, d, m);
        cost = c;
    }

    // default constructor
    Shipment() {
        super();
        cost = -1;
    }

    // constructor used when cube created
    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}
