package box;

public class Lollipop extends Box{
    private String flavor;
    public Lollipop(String name, double price, double weight, String flavor) {
        super(name, price, weight);
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return "Lollipop = [" + super.toString() + ", flavor = " + flavor + "]";
    }
}
