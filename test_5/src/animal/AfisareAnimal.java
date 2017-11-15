package animal;

public class AfisareAnimal {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.setTip("Pisoi;");
        a.setNume("Tobby;");
        a.setCuloare("Neponeatno;");
        a.setCuloareOchi("Albastri;");
        a.setNumarPicioare(4);
        System.out.println("Lista de animale:");
        System.out.println("\nTip:1 "+a.getTip()+
                            "\nNume: "+a.getNume()+
                            "\nCuloare: "+a.getCuloare()+
                            "\nCuloare Ochi: "+a.getCuloareOchi()+
                            "\nNumar de picioare: "+a.getNumarPicioare()+"\n");

      /**  Animal a1 = new Animal("Câine;","Pufie;",
                                "Alb;","Verde",4);
        System.out.println("\nTip2: "+a1.getTip()+
                            "\nNume: "+a1.getNume()+
                            "\nCuloare: "+a1.getCuloare()+
                            "\nCuloare Ochi: "+a1.getCuloareOchi()+
                            "\nNumar de picioare: "+a1.getNumarPicioare());*/
    }

}
