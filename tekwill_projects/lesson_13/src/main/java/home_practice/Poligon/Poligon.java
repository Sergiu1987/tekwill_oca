package home_practice.Poligon;

public class Poligon {
    protected double [] laturi;

   /** Poligon(){

    }*/

    public Poligon( double [] n){
    laturi = n;
    }

    public double perimetru(){
        double s = 0;
        for (int i=0; i<laturi.length; i++) {
            s += laturi[i];
        }
        return s;
    }

}
