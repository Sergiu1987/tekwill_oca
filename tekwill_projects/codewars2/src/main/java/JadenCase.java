public class JadenCase {

    public static void main(String[] args) {
        JadenCase test = new JadenCase();
        System.out.println("View: " + test.toJadenCase("grigorel munceste borea tupeste"));
    }

    public String toJadenCase(String phrase) {
        if (phrase == null || phrase == ""){
            return null;
        }
        String face = "";
        String[] words = phrase.split(" ");
        for (int a = 0; a < words.length; a++) {
            if (a == words.length - 1) {
                face += words[a].substring(0, 1).toUpperCase() + words[a].substring(1);
                // ultimul cuvant UpperCase()
                // face += words[a].toUpperCase();
            } else {
                face += words[a].substring(0, 1).toUpperCase() + words[a].substring(1) + " ";
            }
        }
        return face;
    }


}