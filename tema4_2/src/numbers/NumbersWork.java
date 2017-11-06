package numbers;

public class NumbersWork {
    public static void main(String[] args) {

        double price = 123.76;
        double tax = 9.9;
        int quantity = 5;
        double total;
        String message = "George buy " +quantity+ " MacOS";
        total = price*quantity*tax;
        System.out.println(message);
        System.out.println("Total price is: "+total+ " $");
    }
}
