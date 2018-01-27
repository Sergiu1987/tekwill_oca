package class_practice.lectii_frecventa;

import class_practice.lectii_frecventa.impl.Staff;
import class_practice.lectii_frecventa.impl.Student;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Group {

    private List<Staff> allStaff;

    public Group(List<Staff> allStaff){
        this.allStaff = allStaff;

    }

    public List<Staff> getAllStaff() {
        return allStaff;
    }

    public List<Staff> students(){
        return allStaff.stream()
                .filter(s -> s.getRoleName().equals("Student"))
                .collect(Collectors.toList());
    }
    public List<Staff> professors(){
        return allStaff.stream()
                .filter(s -> s.getRoleName().equals("Professor"))
                .collect(Collectors.toList());
    }
}
