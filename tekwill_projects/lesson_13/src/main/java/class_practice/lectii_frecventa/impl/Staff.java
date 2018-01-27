package class_practice.lectii_frecventa.impl;

import class_practice.lectii_frecventa.api.Role;

public abstract class Staff extends Person implements Role {


    public Staff(String text) {
        super(text);
    }

    public Staff() {
        super();
    }
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Role=")
                .append(getRoleName())
                .append(", {")
                .append(getFirstName())
                .append(", ")
                .append(getLastName())
                .append(getAge() == 99 ? "" : ", " + getAge())
                .append("}");
        return sb.toString();
    }
}
