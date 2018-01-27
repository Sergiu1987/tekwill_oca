package home_practice.Librarie;

public class Librarie {
    private Carti carti;
    private Dulciuri dulciuri;
    private Jucarii jucarii;
    private String numeLibrarie;
    private int spatiuLibrarie;
    private String locatieLibrarie;

    Librarie(Carti carti, Dulciuri dulciuri, Jucarii jucarii, String nume, int spatiu, String locatie) {
        this.carti = carti;
        this.dulciuri = dulciuri;
        this.jucarii = jucarii;
        this.numeLibrarie = nume;
        this.spatiuLibrarie = spatiu;
        this.locatieLibrarie = locatie;

    }

    @Override
    public String toString() {
        return "Libraria: "+numeLibrarie + ", Locatie sectorul " + locatieLibrarie + ", Spatiu comercial " + spatiuLibrarie + "m2. " +
                "\nPrezinta cartea: "+carti.getNumeCarti() + ", cu genul literar " + carti.getLiterarCarti() + ", si numar pagini de " + carti.numarPagini + ". " +
                "\nMai avem in stoc jucarii: " + jucarii.modelJucarii + ", cu numele " + jucarii.numeJucarii + ", la doar pretul de " + jucarii.pretJucarii + " lei " +
                "\nsi deliruri pentru pici: " + dulciuri.tipDulciuri + ", cu forme  " + dulciuri.formaDulciuri + ", la super pret " + dulciuri.pretDulciuri+ " lei.";
    }

    public void modificareNumeLibrarie(){

    }
}
