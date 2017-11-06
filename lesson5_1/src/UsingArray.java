public class UsingArray {
    public static void main(String[] args) {

        String [] items = {"Shirt", "Trousers", "Scarf", "Shirt"};
        String message = "Cumparatorul vrea sa procure " + items.length  +" unitati";
        System.out.println(" "+message);
        System.out.println("\n Cumparatorul vrea sa procure doar: "+items[2] );
    }
}
