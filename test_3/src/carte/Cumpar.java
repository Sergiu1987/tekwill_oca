package carte;

public class Cumpar {

    public static void main(String[] args) {
        Carte c1 = new Carte();
        c1.setNumarPagini(178);
        c1.setNumeAutor("Mihail Drumes");
        c1.setNumeBook("Invitatia la vals");
        System.out.println("Prima carte procurata: "+c1.getNumeBook()+ "\nScriitorul: "+c1.getNumeAutor()+
                "\nNumar de Pagini: "+c1.getNumarPagini());

        String nA = "Mala Gupta";
        String nB = "Java Fundamentals";
        int pageB = 789;
	
        Carte c2 = new Carte();
        c2.setNumarPagini(pageB);
        c2.setNumeBook(nB);
        c2.setNumeAutor(nA);
        System.out.println("A doua carte procurata: "+c2.getNumeBook()+ "\nScriitorul: "+c2.getNumeAutor()+
        "\nNumar Pagini " + c2.getNumarPagini());

        Carte c3 = new Carte();

        String numeAutor3 = "Arthur Schopenhauer";
        String numeBook3 = " Lumea ca vointa si reprezentare ";
        int pageBook = 1025;
        c3.setNumeAutor(numeAutor3);
        c3.setNumeBook(numeBook3);
        c3.setNumarPagini(pageBook);

        String totalCarti ();



    }
}