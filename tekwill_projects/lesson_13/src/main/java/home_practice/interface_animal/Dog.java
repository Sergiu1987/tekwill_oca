package home_practice.interface_animal;

public class Dog implements Animal, Wild {
    public String walk(){
        return "x++, y--";
    }
    public String eat() {
        return "eat whisky";
    }
    public boolean fly(){
        return false;
    }
    public boolean jump(){
        return true;
    }
    public boolean hasHair(){
        return true;
    }
    public String canAttackHuman(){
        return "True";
    }
}
