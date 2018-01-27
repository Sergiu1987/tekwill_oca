package class_practice.lambda;

import java.util.Arrays;
import java.util.List;

public class Test {
   // static String [] weeks = {"april", "january", "august", "september", "may", "july"};
   static String [] days = {"Luni", "Marti", "Miercuri", "Joi", "Friday"};

    public static void main(String[] args){
        MyList newList = new MyList();
        newList.addAll(Arrays.asList(days));
        newList.updateIf(s -> s.equals("Friday"), s -> s + " Black");


        System.out.println(newList);

        newList.updateIf(s -> s.equals("Joi"), s -> ((String)s).toUpperCase());


        System.out.println(newList);

    }

}
