package livada;

public class Plantatie {
     String numeFruct;
     int marimeFruct;
     String culoareFruct;
     double greutateFruct;
     int totalFructe;



    Plantatie(String numeFruct, int marimeFruct, String culoareFruct, double greutateFruct, int totalFructe){
        this.numeFruct = numeFruct;
        this.marimeFruct = marimeFruct;
        this.culoareFruct = culoareFruct;
        this.greutateFruct = greutateFruct;
        this.totalFructe = totalFructe;
    }
    @Override
    public String toString() {
        return ("Livada compusa din: " + this.numeFruct + "\nCuloare: " + this.culoareFruct +
                "\nMarimea de: " + this.marimeFruct + "cm" + "\nCu greutatea de: " + this.greutateFruct+
                "\nTotal pomi: " + this.totalFructe);
    }
}
