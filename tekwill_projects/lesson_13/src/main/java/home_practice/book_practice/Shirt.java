package home_practice.book_practice;

public class Shirt extends Item {
    char size;
    char colorCode;

    Shirt(double price, char size, char colorCode){
        super("Shirt", price);
        this.size = size;
        this.colorCode = colorCode;

    }

    public String getColor(){
        if (colorCode == 'R'){
            return "Red";

        }else if (colorCode == 'G') {
            return "Green";
        }else if (colorCode == 'B'){
            return "Blue";
        }else {
            return "Nu avem asa culori";
        }



        }

    public void display(){
        super.display();
        System.out.println("Size: "+this.size);
        System.out.println("Color Code: "+this.colorCode);
    }
}
