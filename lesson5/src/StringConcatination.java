public class StringConcatination {
    public static void main(String[] args) {



        String log = "ERROR d[sjlvhsjkvhsjkv]nsdfjkvfdjkbvjkbahgdshfgerukhjsdbnvxcnmbvxc,bmcbjgjhdojvklnvm," +
                "xcnvuerhgh689766084575834";

        if (log.toLowerCase().contains("error")) {
            int indexStartErro = log.indexOf("[");
            int indexEndError = log.indexOf("]");
            System.out.println(log.charAt(30));
            String s = log.substring(indexStartErro + 1, indexEndError);
            System.out.println("\n" + s);

        }
    }
}

