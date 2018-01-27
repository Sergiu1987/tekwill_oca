package class_practice.lectii_frecventa.impl;

public class Professor extends Staff {

    public Professor(String text) {
        super();
        try {
            String[] data = text.split(" ");
            firstName = data[0];
            lastName = data[1];
            age = Integer.parseInt(data[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            age = 99;
            if (Integer.parseInt(e.getMessage()) > 1){
                age = 99;
            }else {
                throw e;
            }


        }
    }


    @Override
    public String getRoleName() {
        return "Professor";
    }
}
