package item;

public class Item {
    public int ID;
    public String descr;
    public double price;
    public int quantity;

    public void setDescr (String newdescr){
        this.descr = newdescr ;
    }
    public void setPrice (double newprice){
            this.price = newprice;
    }
    public void setQuantity (int newquantity){
        this.quantity = newquantity;
    }
    public void setID(int newID) {
        this.ID = newID;
    }

    public String getDescr() {
        return descr;
    }

    public double getPrice() {
        return price;
    }

    public int getID() {
        return ID;
    }

    public int getQuantity() {
        return quantity;
    }
}
