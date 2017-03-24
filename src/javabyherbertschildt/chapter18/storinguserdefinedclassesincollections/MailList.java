package javabyherbertschildt.chapter18.storinguserdefinedclassesincollections;

// A simple mailing list example.

import java.util.LinkedList;

class Address {

    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    public Address(String name, String street, String city, String state, String code) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.code = code;
    }

    @Override
    public String toString() {
        return this.name + "\n" + this.street + "\n" +
                this.city + " " + this.state + " " + this.code;
    }
}

public class MailList {
    public static void main(String[] args) {
        LinkedList<Address> addresses = new LinkedList<>();

        addresses.add(new Address("J.W. West", "11 Oak Ave",
                "Urbana", "IL", "61801"));
        addresses.add(new Address("Ralph Baker", "1142 Maple Lane",
                "Mahomet", "IL", "61853"));
        addresses.add(new Address("Tom Carlton", "867 Elm St",
                "Champaign", "IL", "61820"));

        for (Address element : addresses) {
            System.out.println(element);
            System.out.println();
        }
    }
}
