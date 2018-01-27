import java.util.ArrayList;
import java.util.List;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        String binaryString = "";
        for (int i = 0; i < binary.size(); i++) {
            binaryString += binary.get(i).toString();
        }
        return Integer.parseInt(binaryString, 2);
    }

    public static void main(String[] args) {
        ArrayList codeBinary = new ArrayList<Integer>();
        codeBinary.add(0);
        codeBinary.add(1);
        codeBinary.add(0);
        codeBinary.add(1);


        System.out.println("Afisam: " + ConvertBinaryArrayToInt(codeBinary));
    }

}