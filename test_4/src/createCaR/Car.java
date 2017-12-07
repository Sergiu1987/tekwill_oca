package createCaR;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Car {
    public static void main(String[] args) {

        //Atribuirea variabilei de clasa
        CreateCar.roti = 4;
        CreateCar.inmatriculare = "Republica Moldova";

        Motor motor1 = new Motor("V8-VVTi",2989,"Benzina");

        CreateCar car1 = new CreateCar();

        car1.setAccelerare(5.35);
        car1.setCuloare("");
        car1.setMarca("Rolls-Royce");
        car1.setModel("Phantom");
        car1.setTipCutieViteze("Automat");
        car1.setVitezaMaxima(320);

        CreateCar cars = new CreateCar("Toyota;","Prius;","Alb;","Automat;",
                11.4,180, motor1);

        CreateCar cars2 = new CreateCar("Renault;","Clio;","Sur;","Manual;",
                13,200,null);

        System.out.println("Salon Auto Detroit:");

        System.out.println(car1);
        System.out.println(cars);
        System.out.println(cars2);
    }

}