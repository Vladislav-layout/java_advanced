package box;

public class Candy extends Box {
    private String filling;

    public Candy(String name, double price, double weight, String filling) {
        super(name, price, weight);
        this.filling = filling;
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    @Override
    public String toString() {
        return "Candy = [" + super.toString() + ", filling = " + filling + "]";
    }
}
