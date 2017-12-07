import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Clothing cloth1 = new Shirt("M");
        Clothing cloth2 = new Pant();

        List<Clothing> list = new ArrayList<Clothing>();

        list.add(cloth1);
        list.add(cloth2);

        for (Clothing cloth : list) {
            if (cloth1 instanceof Shirt) {
                ((Shirt) cloth1).setFit("S");
            }

            System.out.println(cloth);
            System.out.println("Shiping for this item is: "+cloth.calculateShip());

        }
    }
}
