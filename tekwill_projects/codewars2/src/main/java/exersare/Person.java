package exersare;

public class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person persoana = new Person("Jora", 14);
        System.out.println(persoana.name + " are " + persoana.age + " ani ");
        System.out.println(persoana);

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " are " +
                age + " ani ";
    }


}
