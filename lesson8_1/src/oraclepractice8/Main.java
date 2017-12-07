package oraclepractice8;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car2 car2 = new Car2();

        car1.setColor('R');
        car1.setMass(Car2.DEFAULT_MASS);
        System.out.println(car1);
        System.out.println(Car2.DEFAULT_MASS+"kg");
    }


}
