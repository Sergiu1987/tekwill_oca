package oraclepractice8;

public class Car {
    private char color;
    private static int mass;



    public Car(){

    }

    public Car(char color){
        this.color = color;
    }
    public boolean setColor(char color){
        if (color != ' '){
            this.color = color;
            return true;
        }
        return false;

    }

    public int getMass() {
        return mass;
    }

    public static void setMass(int mass) {
        Car.mass = mass;
    }

    public String toString(){
        return"Car color: "+this.color;
    }
}
