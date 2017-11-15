package animal;

public class Animal {
    String tip;
    String nume;
    String culoare;
    String culoare_ochi;
    int numar_picioare;

    Animal(String tip, String nume, String culoare, String culoare_ochi, int numar_picioare){
        this.tip = tip;
        this.nume = nume;
        this.culoare = culoare;
        this.culoare_ochi = culoare_ochi;
        this.numar_picioare = numar_picioare;
    }

    public void setTip(String Tip){
        this.tip = Tip;
    }
    public void setNume(String Nume){
        this.nume = Nume;
    }
    public void setCuloare(String Culoare){
        this.culoare = Culoare;
    }
    public void setCuloare_ochi(String Culoare_Ochi){
        this.culoare_ochi = Culoare_Ochi;
    }
    public void setNumar_picioare(int Numar_Picioare){
        this.numar_picioare = Numar_Picioare;
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
    public String getCuloare_ochi() {
        return culoare_ochi;
    }
    public int getNumar_picioare() {
        return numar_picioare;
    }
}
