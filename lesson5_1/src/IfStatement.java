import com.sun.org.apache.xpath.internal.SourceTree;

public class IfStatement {

    public static void main(String[] args) {
        int quantity = 2;
        int cost = 5;
        int costTotal = cost*quantity;
        String message = " avem " + quantity + " item";

        if (quantity > 1) {
            message = message + 'e';
            System.out.println(" In stock: " + message);
        } else {
            System.out.println(message + " ");
        }
        boolean outOfStock = true;
        if (outOfStock) {
            System.out.println(" Nu avem iteme in stock");
        }
        else {
            System.out.println(" In stoc avem "+cost+ " iteme; costul total = "+costTotal);
        }


    }
}
