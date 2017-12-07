package carte;

public class Carte {
    private int numarPagini;
    private String numeAutor;
    private String numeBook;

    public void setNumarPagini (int pagini){
        this.numarPagini = pagini;
    }
    public void setNumeAutor (String autor){
        this.numeAutor = autor;
    }
    public void setNumeBook (String book){
        this.numeBook = book;
    }

    public int getNumarPagini() {
        return numarPagini;
    }

    public String getNumeAutor() {
        return numeAutor;
    }

    public String getNumeBook() {
        return numeBook;
    }
}
