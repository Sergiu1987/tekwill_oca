package CarteaTa;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Librarie {
    public static void main(String[] cmd){
        System.out.println("Calcule estimative a Librariei online CarteTa:");
        System.out.println(("###################"));
    int a = 125;
    int b = 130;
    int c = 145;
    int d = 155;
    int e = 240;
    int f = 120;
    int chi = 10500;
    int pro = 45;
    int vest = 25000;


    int sumTotal = sum(a,b,c,d,e,f);
        System.out.println("Totalul de carti vandute pe perioada de 6 Luni: ");
        System.out.println(a+ " + " +b+ " + " +c+ " + " +d+ " + " +e+ " + " +f+ " = " +sumTotal);
    int cheInit = cheltuieli(chi, sumTotal);
        System.out.println("Cheltuieli pentru procurare si transport");
        System.out.println(chi+ " - " +sumTotal+ " = " +cheInit);
    int  profTotal = profit(sumTotal, pro );
        System.out.println("Profitul in urma comercializarii");
        System.out.println(sumTotal+ " * " +pro+ " = " +profTotal);
    int investTii = investitii(profTotal, vest);
        System.out.println("Investitiile initiale ");
        System.out.println(profTotal+ " - " +vest+ " = " +investTii);
    int bugetTotal = buget(chi, vest);
        System.out.println("Bugetul total prevazut ");
        System.out.println(chi+ " + " +vest+ " = " +bugetTotal);
    afisare(7,3);



    }

static int sum(int a, int b, int c, int d, int e, int f){
    return a + b + c + d + e + f;
}
static int cheltuieli(int c1, int c2){
    return c1 - c2;
}
static int profit(int p1, int p2){
    return p1 * p2;
}
static int investitii(int i1, int i2){
    return i1 - i2;
}
static int buget(int bt1, int bt2){
    return bt1 + bt2;
    }
static void afisare (int a1, int a2){
   // int result = a1+a2;
    System.out.println("Afisare a rezultatului din Metoda fara return");
    System.out.println(a1+ " + " +a2+ " = " +(a1+a2));
    }



}