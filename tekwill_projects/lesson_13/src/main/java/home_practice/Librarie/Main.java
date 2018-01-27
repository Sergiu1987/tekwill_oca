package home_practice.Librarie;

public class Main {
    public static void main(String[] args) {
        Carti carticarteaTa = new Carti("Suge'o Ramona", 185, "Critica");
        Carti cartiproNoi = new Carti("Amintiri din Copilarie", 121, "Biografie");
        Carti cartibestSeller = new Carti("Fluturi", 210, "Beletristica");
        Jucarii jucariicarteaTA = new Jucarii("Bogdanel", "Ursuleti", 120.15);
        Jucarii jucariiproNoi = new Jucarii("Bunny", "Iepurasi", 155);
        Jucarii jucariibestSeller = new Jucarii("Thomas", "Trenuti", 190.25);
        Dulciuri dulciuricarteaTA = new Dulciuri("Prajituri", "Inele", 12);
        Dulciuri dulciuriproNoi = new Dulciuri("Torte", "Felii", 18.50);
        Dulciuri dulciuribestSeller = new Dulciuri("Biscuiti", "Rotunde", 16);

        Librarie carteaTA = new Librarie(carticarteaTa, dulciuricarteaTA, jucariicarteaTA, "CarteaTa", 65, "Centru");
        Librarie proNoi = new Librarie(cartiproNoi, dulciuriproNoi, jucariiproNoi, "ProNoi", 120, "Botanica");
        Librarie bestSeller = new Librarie(cartibestSeller, dulciuribestSeller, jucariibestSeller, "BestSeller", 92, "Telecentru");

        System.out.println(carteaTA);
        System.out.println("+==============================================================+");
        System.out.println(proNoi);
        System.out.println("+==============================================================+");
        System.out.println(bestSeller);

    }


}

