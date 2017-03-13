package JavaByHerbertSchildt.Chapter12.JavaEnumerationsAreClassTypes;

/**
 * Created by ibakhtin on 12.03.17.
 */

enum Apple {
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);

    private int price;

    Apple(int price) {
        this.price = price;
    }

    int getPrice() {
        return price;
    }
}
