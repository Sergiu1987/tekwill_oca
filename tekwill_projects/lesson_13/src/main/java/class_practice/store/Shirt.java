package class_practice.store;

public class Shirt extends Clothing implements Returnable {
    private String fit;
    private final double SHIP_PRICE = 5;

    public String getFit() {
        return fit;
    }
    Shirt(){

    }

    public void setFit(String fit) {
        this.fit = fit;
    }

    public Shirt(String fit) {
        super(20, "description", 'C', 22.6);
        this.fit = fit;
    }

    @Override
    public String doReturn() {
        return "Suit returns must be within 3 days";

    }

    @Override
    public double calculateShip(){
        double parentValue = super.SHIP_PRICE;
        return SHIP_PRICE * parentValue;
    }
    public String toString(){
        return "Shirt fit is: "+fit;
    }
}
