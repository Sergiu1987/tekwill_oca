import com.sun.org.apache.xpath.internal.SourceTree;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.setName("a");
        p1.setSurname("b");

        System.out.println(p1);


        Person p2 = new Person("a", "b", 78);
        System.out.println(p2);

        int a = 5;
        int b = 5;

        if (p1 == p2) {
        System.out.println("true");

        } else {
            System.out.println("false");
        }

        System.out.println(false || true && true);
    }

}

