import box.Box;
import box.Candy;
import box.Lollipop;

public class Base {

    public static void main(String[] args) {
        double weightBox;
        double priceBox;
        Candy candy1 = new Candy("Raffaello", 50.0, 14, "coconut");
        Candy candy2 = new Candy("Bird's milk", 35.5, 17.3, "chocolate");
        Lollipop lollipop1 = new Lollipop("chicken", 15.5, 20.4, "childhood");
        Box[] box = {candy1, candy2, lollipop1,};
        weightBox = candy1.getWeight() + candy2.getWeight() + lollipop1.getWeight();
        priceBox = candy1.getPrice() + candy2.getPrice() + lollipop1.getPrice();
        System.out.println("Box weight = " + weightBox + ", Box price = " + priceBox);
        for (Box someBox : box) {
            System.out.println("Sweets in a box:\n" + someBox.toString());
        }
    }
}
