package animal;

public class Animal {
    String tip;
    String nume;
    String culoare;
    String culoareOchi;
    int numarPicioare;

   /**Animal(String tip, String nume, String culoare, String culoareOchi, int numarPicioare){
        this.tip = tip;
        this.nume = nume;
        this.culoare = culoare;
        this.culoareOchi = culoareOchi;
        this.numarPicioare = numarPicioare;
    }*/

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
    public void setNumarPicioare(int Numar_Picioare){
        this.numarPicioare = Numar_Picioare;
    }
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
}
