package valuta;

public class Valuta {

    private String name;
    private int age;
    private int seria;
    private final double defaultValue = 1;

    public double buy(){
        return 3*defaultValue;
    }
    public double sell() {
        return 3 * -defaultValue;
    }

    @Override
    public String toString() {
        return "Name: " + this.name
                + "\nSerie: " + this.seria
                + "\nAge: " + this.age;
    }

    /////// Metode Getter Setter
    public String getName() {return name;}
    public int getAge() {return age;}
    public int getSeria() {return seria;}

    public void setName(String name) {this.name = name;}
    public void setAge(int age) {this.age = age;}
    public void setSeria(int seria) {this.seria = seria;}
}


