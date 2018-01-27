package home_practice.Automobil;

public class Main {
    public static void main(String[] args) {
        Roti rotiMercedes = new Roti("Iarna", 17, 4);
        Roti rotiReno = new Roti("Vara", 14, 4);
        Roti rotiLada = new Roti("Demisezon", 13, 4);
        Motor motorMercedes = new Motor("Benzin", 4);
        Motor motorReno = new Motor("Diesel", 1.5);
        Motor motorLada = new Motor("Gaz", 1.1);
        Sticla sticlaMercedes = new Sticla("tonate");
        Sticla sticlaReno = new Sticla("simple");
        Sticla sticlaLada = new Sticla("tonate");
        Usi usiMercedes = new Usi(5, sticlaMercedes);
        Usi usiReno = new Usi(4, sticlaReno);
        Usi usiLada = new Usi(3, sticlaLada);

        Automobil mercedes = new Automobil("Mercedes", "Neagra", rotiMercedes, motorMercedes, usiMercedes);
        Automobil reno = new Automobil("Reno", "Metalic", rotiReno, motorReno, usiReno);
        Automobil lada = new Automobil("Lada", "Rosie", rotiLada, motorLada, usiLada);


        //System.out.println(mercedes.nume + " " + mercedes.roti.numarRoti+" roti, "+
        //"diagonala "+mercedes.roti.diagonala+", de "+mercedes.roti.tipRoti+
        //", "+mercedes.usi.numarUsi+" usi, "+ "sticle "+mercedes.usi.usisticla.tipSticla+", motor "+
        //mercedes.motor.capCilindrica+"L "+mercedes.motor.tipCarborant+".");
        System.out.println(mercedes);
        System.out.println(reno);
        System.out.println(lada);
    }
}
