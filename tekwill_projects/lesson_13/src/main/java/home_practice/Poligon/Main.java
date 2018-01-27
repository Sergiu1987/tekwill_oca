package home_practice.Poligon;

public class Main {
    public static void main(String[] args) {
        double[] laturiPoligon = {12,4,12,4};
        Poligon p1 = new Dreptunghi(12.5,4.2, laturiPoligon);
        Poligon p2 = new Dreptunghi(10.2,3.6, laturiPoligon);

        System.out.println("Perimetru dreptunghiului:"+p1.perimetru());

            System.out.println("Aria: " +((Dreptunghi)p2).aria());


    }
}
