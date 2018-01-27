package home_practice.Librarie;

public class Carti {
    private String numeCarti;
    private int numarPagini;
    private String genLiterarCarti;

    Carti(String numeCarti, int numarPagini, String genLiterarCarti){
        this.numeCarti = numeCarti;
        this.numarPagini = numarPagini;
        this.genLiterarCarti = genLiterarCarti;

    }

    public String getNumeCarti() {
        return numeCarti;
    }

    public int getNumarPagini() {
        return numarPagini;
    }

    public String getGenLiterarCarti() {
        return genLiterarCarti;
    }
}
