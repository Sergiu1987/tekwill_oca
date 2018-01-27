package class_practice;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
     /**   CreateFile testClass = new CreateFile();
        try {
            testClass.testCheckedException();

        } catch (IOException exce) {
            System.out.println(exce);
        }

    }
    public void testCheckedException() throws IOException{
        File testFile = new File("//testFile.txt");
        testFile.createNewFile();
        System.out.println("testFile exists: "+testFile.exists());

      */
        try {
            createFile("c:/testFile.txt");
        } catch (Exception e) {

            System.out.println(e);
            //<other actions>
        }
    }

    public static void createFile(String fname) throws IOException {
        File f = new File(fname);
        System.out.println(fname + " exists? " + f.exists());
        f.createNewFile();
        System.out.println(fname + " exists? " + f.exists());
        int[] intArray = new int[5];
        intArray[5] = 27;
    }

}
