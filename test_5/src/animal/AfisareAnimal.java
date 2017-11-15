package animal;

public class AfisareAnimal {
    public static void main(String[] args) {
       /** Animal a = new Animal();
        a.setTip("Pisoi;");
        a.setNume("Tobby;");
        a.setCuloare("Neponeatno;");
        a.setCuloare_ochi("Albastri;");
        a.setNumar_picioare(4);
        System.out.println("Lista de animale:");
        System.out.println("\nTip: 1"+a.getTip()+
                            "\nNume: "+a.getNume()+
                            "\nCuloare: "+a.getCuloare()+
                            "\nCuloare Ochi: "+a.getCuloare_ochi()+
                            "\nNumar de picioare: "+a.getNumar_picioare()+"\n"); */

        Animal a1 = new Animal("Câine;","Pufie;",
                "Alb;","Verde",4);
        System.out.println("\nTip2: "+a1.tip+
                            "\nNume: "+a1.getNume()+
                            "\nCuloare: "+a1.getCuloare()+
                            "\nCuloare Ochi: "+a1.getCuloare_ochi()+
                            "\nNumar de picioare: "+a1.getNumar_picioare());
    }

}
