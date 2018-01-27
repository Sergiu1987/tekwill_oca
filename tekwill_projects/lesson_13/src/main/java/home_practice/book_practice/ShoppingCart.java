/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package home_practice.book_practice;

import java.util.List;

public class ShoppingCart {
    public static void main(String args[]){ 
	// Instantiate a Shirt object and call display() on the object reference
        Item obj1 = new Shirt(12.3,'L', 'Y');
        obj1.display();

        if (obj1 instanceof Shirt){
            String color = ((Shirt) obj1).getColor();
            System.out.println(color);
        }else {
            System.out.println("Nu face parte din object Shirt");
        }





        
       
    }
}    
