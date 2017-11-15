public class UsingindexOf {
    public static void main(String[] args) {
        String custName = "George Toparceanu";
        String firstName;
        int spaceIdx;

        spaceIdx = custName.indexOf(" ");
        System.out.println("SpaceIdx: "+spaceIdx);

        firstName = custName.substring(0, spaceIdx);
        System.out.println("firstName: "+firstName);

        StringBuilder sB = new StringBuilder(firstName);
        String lastName = " Ghita";
        sB.append(lastName);
        System.out.println(sB);

        long number = 234567856787653456L;
        float number1 = 4.66F;
        char number2 = 7;
        int number4 = 567;
        System.out.println(number);
        number4 = (int)number;
        System.out.println(number4);





    }

}
