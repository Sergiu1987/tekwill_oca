package item;

import com.sun.org.apache.xpath.internal.SourceTree;

public class ShoppingCart {



    public static void main(String[] args) {
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();


        //item2 = item1;
        //item1 = item2;
        //item2 = item1;

        item1.descr = "Croasant";
        item1.price = 12.50;
        item1.quantity = 4;
        item2.descr = "Placinta";
        item2.price = 18.32;
        item2.quantity = 3;
        item3.setDescr("Foietaj");
        item3.setPrice(7.25);
        item3.setQuantity(6);



        System.out.println("Item1: 1 " +item1.descr + " = " + item1.price+" lei"+ ", \n"+item1.quantity
        +" Croasante = "+item1.quantity*item1.price);

        System.out.println("\nItem2: 1 "+" "+item2.descr + " = " + item2.price+" lei"+ ", \n"+ item2.quantity
        +" Placinte = "+item2.quantity*item2.price);

        System.out.println("\nItem3: 1 " +item3.getDescr()+ " = " + item3.getPrice()+" lei"+ ", \n"+item3.getQuantity()
                +" Croasante = "+item3.getQuantity()*item3.getPrice());

    }
}
