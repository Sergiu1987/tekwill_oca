package class_practice.clothing;

public class Shirt extends Clothing {
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
    public double calculateShip(){
        double parentValue = super.SHIP_PRICE;
        return SHIP_PRICE * parentValue;
    }
    public String toString(){
        return "Shirt fit is: "+fit;
    }
}
