package home_practice.interface_animal;

public class Cat implements Animal {
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

    @Override
    public String toString() {
        return "walk: "+this.walk()+
                "eat: "+this.eat()+
                "fly: "+this.fly()+
                "jump: "+this.jump()+
                "has hair: "+this.hasHair();

    }
}
