package oraclepractice8;

public class Car2 {

    public static int DEFAULT_MASS = 1000;

    public int wheels;

    public static int getDefaultMass() {
        return DEFAULT_MASS;
    }

    public int getWheels() {
        return wheels;
    }

    public static void setDefaultMass(int defaultMass) {
        DEFAULT_MASS = defaultMass;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
}
