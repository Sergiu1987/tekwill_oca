// Pachetul clasei
package createCaR;

// Numele Clasei
public class CreateCar {

    /*--------------- Proprietatile clasei ---------------- */

    // Variabilele de instanta
    String marca;
    String model;
    String tipCutieViteze;
    double accelerare;
    int vitezaMaxima;
    String culoare;
    Motor motorulMeu;


    //Variabile de tip clasa
    static int nrAutomobil;
    static int roti;
    static String inmatriculare;


    /* ---------------Constructori --------------------*/

    // Constructor cu parametri
    CreateCar (String marca, String model, String culoare, String tipcutieviteze, double accelerare, int vitezaMaxima, Motor nouMotor ){
        this.marca = marca;
        this.model = model;
        this.tipCutieViteze = tipcutieviteze;
        this.accelerare = accelerare;
        this.vitezaMaxima = vitezaMaxima;
        this.culoare = culoare;
        this.motorulMeu = nouMotor;


    }


    // Constructor implicit
    CreateCar() {

    }


    /* ------------------- Metode ------------------- */

    // Metode de tip setter
    public void setMarca(String tipMarca){
        this.marca = tipMarca;
    }
    public void setModel(String tipModel){
        this.model = tipModel;
    }
    public void setTipCutieViteze(String tipCutieViteze){
        this.tipCutieViteze = tipCutieViteze;
    }
    public void setAccelerare(double tipAccelerare){
        this.accelerare = tipAccelerare;
    }
    public void setVitezaMaxima(int tipVitezaMaxima){
        this.vitezaMaxima = tipVitezaMaxima;
    }
    public void setCuloare(String tipCuloare){this.culoare = tipCuloare;}

    // Metode de tip getter
    public String getMarca() {
        return marca;
    }
    public String getModel() {
        return model;
    }
    public String getCuloare() {
        return culoare;
    }
    public String getTipCutieViteze() {
        return tipCutieViteze;
    }
    public double getAccelerare() {
        return accelerare;
    }
    public int getVitezaMaxima() {
        return vitezaMaxima;
    }
    public int getRoti(){return roti;}
    public String getInmatriculare(){return inmatriculare;}


    // Metode de tip toString
    @Override
    public String toString() {
        return "\nNumar Automobil: " + ++nrAutomobil + "\n--------------------" +
                "\nMarca: " + marca + "\nModel: " + model + "\nCuloare: " + culoare +
                "\nTip cutie viteza: "+ tipCutieViteze + "\nAccelerare: " + accelerare +
                "\nViteza maxima: " + vitezaMaxima + "\nRoti: " + roti + "\nInmatriculare: " + inmatriculare+
                "\n" + motorulMeu;
    }
}