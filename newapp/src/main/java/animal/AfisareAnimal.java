package animal;

public class AfisareAnimal {
    public static void main(String[] args) {

        //Atribuirea variabilei de clasa

        Animal.numarPicioare = 4;

        //Atribuirea variabilelor

        Rasa rasaPisica = new Rasa("Siemez", 3,"Whiskas");
        Rasa rasaCaine = new Rasa("Taxa",4,"PediGree");

        Animal animalPisica = new Animal();

        animalPisica.setTip("Pisoi");
        animalPisica.setNume("Tobby");
        animalPisica.setCuloare("Neponeatno");
        animalPisica.setCuloareOchi("Albastri");
        animalPisica.setAnimalRasa(rasaPisica);

        System.out.println("Lista de animale:");

        /**System.out.println("\nTip:1 "+a.getTip()+
                            "\nNume: "+a.getNume()+
                            "\nCuloare: "+a.getCuloare()+
                            "\nCuloare Ochi: "+a.getCuloareOchi()+
                            "\nNumar de picioare: "+a.getNumarPicioare()+"\n");*/

        Animal animalCaine = new Animal("Câine","Pufie",
                                "Alb","Verde",rasaCaine);


       /** System.out.println("\nTip2: "+a1.getTip()+
                            "\nNume: "+a1.getNume()+
                            "\nCuloare: "+a1.getCuloare()+
                            "\nCuloare Ochi: "+a1.getCuloareOchi()+
                            "\nNumar de picioare: "+a1.getNumarPicioare());*/


        System.out.println(animalCaine);
        System.out.println(animalPisica);
    }
}