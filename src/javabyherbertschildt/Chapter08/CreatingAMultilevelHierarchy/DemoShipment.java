package javabyherbertschildt.Chapter08.CreatingAMultilevelHierarchy;

/**
 * Created by ibakhtin on 07.03.17.
 */

// DemoShipment class.

public class DemoShipment {
    public static void main(String[] args) {
        Shipment shipmentA = new Shipment(10, 20, 15, 10, 3.75);
        Shipment shipmentB = new Shipment(2, 3, 4, 0.75, 1.25);

        System.out.println("Volume of shipmentA: " + shipmentA.volume());
        System.out.println("Weight of shipmentA: " + shipmentA.weight);
        System.out.println("Shipping cost: $" + shipmentA.cost);
        System.out.println();

        System.out.println("Volume of shipmentB: " + shipmentB.volume());
        System.out.println("Weight of shipmentB: " + shipmentB.weight);
        System.out.println("Shipping cost: $" + shipmentB.cost);
        System.out.println();
    }
}
