package class_practice.lectii_frecventa;

import class_practice.lectii_frecventa.impl.Professor;
import class_practice.lectii_frecventa.impl.Staff;
import class_practice.lectii_frecventa.impl.Student;

import java.util.ArrayList;
import java.util.List;

public class Tekwill  {
    public static void main(String[] args) {
        List<Staff> staffList = new ArrayList<>();
        try {
            staffList.add(new Professor("Denis B"));
            staffList.add(new Professor("Radu J"));
            staffList.add(new Professor("Andrei F"));
            staffList.add(new Professor("Vitalie D"));
            staffList.add(new Student("Sergiu S 29"));
            staffList.add(new Student("Serghei P 1"));
            staffList.add(new Student("Iulian Iulian 29"));
            staffList.add(new Student("Bogdan Bogdan 29"));

            Group group = new Group(staffList);
            Course courseOCA = new Course(group, 10);


            courseOCA.start();

            courseOCA.printLessons();
            courseOCA.printPresence();
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Exceptia obtinuta");
//            System.out.println(e.getMessage());
//        }
//        catch (NotStartedException e) {
//            System.out.println("Exceptia obtinuta");
//            System.out.println(e.getMessage());
//        }
        } catch (IndexOutOfBoundsException | NotStartedException e) {
            System.out.println("Exceptia obtinuta");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("eroare neprevazuta");
            throw e;
        }
    }
}
