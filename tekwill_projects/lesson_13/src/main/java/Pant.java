public class Pant extends Clothing{
    private final double SHIP_PRICE = 15;

    private String fit;

    public String getFit() {
        return fit;
    }

    public void setFit(String fit) {
        this.fit = fit;
    }
    public String toString(){
        return "Pant fit is: "+getFit();
    }

}