package home_practice.Automobil;

public class Automobil {
    Roti roti;
    Motor motor;
    Usi usi;
    String nume;   //caracteristicile la obiecte se tin mereu in Field-uri
    String culoare;

    Automobil(String nume, String culoareNoua, Roti roti, Motor motor, Usi usi){
        this.nume = nume;
        this.culoare = culoareNoua;
        this.roti = roti;
        this.motor = motor;
        this.usi = usi;

        }

    @Override
    public String toString() {
        return nume+" "+roti.numarRoti+" roti, diagonala "+
                roti.diagonala+", de "+ roti.tipRoti+", "+usi.numarUsi+" usi, sticle "+
                usi.usisticla.tipSticla+", motor "+motor.capCilindrica+"L "+motor.tipCarborant;
    }
}
