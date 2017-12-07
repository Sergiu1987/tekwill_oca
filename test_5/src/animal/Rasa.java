//Pachetul clasei
package animal;

    //Nume Clasa
public class Rasa {
    /*--------------- Proprietatile clasei ---------------- */

        // Variabilele de instanta

        String tip;
        int greutate;
        String mancare;

        /* ---------------Constructori --------------------*/

        // Constructor cu parametri

        Rasa(String rasaAnimal, int greutateKg, String mancareTip){
            this.tip = rasaAnimal;
            this.greutate = greutateKg;
            this.mancare = mancareTip;


        }
        /* ------------------- Metode ------------------- */

        // Metode de tip toString

        @Override
        public String toString() {
            return "Rasa: " + tip + "\nGreutate: " + greutate +"kg" + "\nMancare: " + mancare;
        }
    }
