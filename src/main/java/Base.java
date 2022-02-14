import box.Box;
import box.Candy;
import box.Lollipop;

public class Base {

    public static void main(String[] args) {
        double weightBox = 0;
        double priceBox = 0;
        Candy candy1 = new Candy("Raffaello", 50.0, 14, "coconut");
        Candy candy2 = new Candy("Bird's milk", 35.5, 17.3, "chocolate");
        Lollipop lollipop1 = new Lollipop("chicken", 15.5, 20.4, "childhood");
        Box[] box = {candy1, candy2, lollipop1};

        for (Box value : box) {
            weightBox += value.getWeight();
            priceBox += value.getPrice();
        }

        System.out.println("Box weight = " + weightBox + ", Box price = " + priceBox);
        for (Box someBox : box) {
            System.out.println("Sweets in a box:" + "\n" + someBox.toString());
        }
    }
}
