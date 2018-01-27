package home_practice.Poligon;

public class Dreptunghi extends Poligon {
    public Dreptunghi(double l, double h, double[] i){
        super(i);
        laturi[0] = laturi[2] = l;
        laturi[1] = laturi[3] = h;
    }
    public double aria(){

        return laturi[0]*laturi[1];
    }
}
