package class_practice.lectii_frecventa.impl;

import class_practice.lectii_frecventa.api.Character;

public class Person implements Character{
    protected String firstName;
    protected String lastName;
    protected int age;

    public Person(String text) {
        String[] data = text.split(" ");
        firstName = data[0];
        lastName = data[1];
        age = Integer.parseInt(data[2]);
    }
    public Person() {
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public int getAge() {
        return age;
    }

}
