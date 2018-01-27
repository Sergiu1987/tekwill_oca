package remove_space_from_string;

public class Kata {
    static String noSpace(final String x){
        return x.replaceAll("\\s+","");
    }

    public static void main(String[] args) {
        System.out.println(Kata.noSpace("grivei catel tarcat"));
    }

}
