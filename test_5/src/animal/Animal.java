package animal;

public class Animal {

    //Variabilele de instanta;
    String tip;
    String nume;
    String culoare;
    String culoareOchi;
    Rasa animalRasa;

    //Variabila de clasa;
    static int numarPicioare;



    //Crearea constructorului
   Animal(String tip, String nume, String culoare, String culoareOchi, Rasa nouaRasa){
        this.tip = tip;
        this.nume = nume;
        this.culoare = culoare;
        this.culoareOchi = culoareOchi;
        this.animalRasa = nouaRasa;
    }
    Animal (){

    }


    //Metode de tip setter;
    public void setTip(String Tip){
        this.tip = Tip;
    }
    public void setNume(String Nume){
        this.nume = Nume;
    }
    public void setCuloare(String Culoare){
        this.culoare = Culoare;
    }
    public void setCuloareOchi(String Culoare_Ochi){
        this.culoareOchi = Culoare_Ochi;
    }
    public void setAnimalRasa(Rasa rasaAnimal) {this.animalRasa = rasaAnimal;}

    //Metode de tip getter;
    public String getTip(){
        return tip;
    }
    public String getNume(){
        return nume;
    }
    public String getCuloare() {
        return culoare;
    }
    public String getCuloareOchi() {
        return culoareOchi;
    }
    public int getNumarPicioare() {
        return numarPicioare;
    }
    public Rasa getAnimalRasa(){return  animalRasa;}




    @Override
    public String toString() {
        return "----------------------"+
                "\nTip: " + tip + "\nNume: " + nume + "\nCuloare: " + culoare+
                "\nCuloare ochi: " +culoareOchi+"\nNumar picioare: "+numarPicioare+
                "\n"+animalRasa;


    }

}
