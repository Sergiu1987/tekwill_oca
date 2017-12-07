//Pachetul clasei
package createCaR;

    //Nume Clasa
public class Motor {
     /*--------------- Proprietatile clasei ---------------- */

    // Variabilele de instanta
    String tip;
    int capacitate;
    String combustibil;

    /* ---------------Constructori --------------------*/

    // Constructor cu parametri
    Motor (String tipulMotorului, int capacitateaMotor, String combustibil ){
        this.combustibil = combustibil;
        this.capacitate = capacitateaMotor;
        this.tip = tipulMotorului;
    }


    /* ------------------- Metode ------------------- */

    // Metode de tip toString
        @Override
        public String toString() {
            return "Motor: " + tip + "\nCapacitate motor: " + capacitate +"cm3"+ "\nCombustibil: " + combustibil;
        }












}
