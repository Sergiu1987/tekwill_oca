package class_practice.lectii_frecventa;

import class_practice.lectii_frecventa.impl.Staff;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private Group group;
    private int numberOfLessons;
    private List<Lesson> listOfLessons;

    public Course(Group group, int numberOfLessons) {
        this.group = group;
        this.numberOfLessons = numberOfLessons;

    }

    public void start(){
        listOfLessons = new ArrayList<>();
        int i = 0;
        for (; i < numberOfLessons; i++ ){
            Lesson lesson = new Lesson(group);
            lesson.start();
            listOfLessons.add(lesson);
        }
    }

    public void printLessons() {
        checkStarted();

        for (Lesson lesson : listOfLessons){
            lesson.print();
        }
    }

    public void printPresence() {
        checkStarted();
        System.out.println("\nPressence ");
        for (Staff pressence : group.getAllStaff()){
            int i = 0;
            int j = 0;
            System.out.println(pressence);
            for (Lesson lessonpressence : listOfLessons){
                if (lessonpressence.getPresence().isPresent(pressence)){
                   // System.out.println("Prezent");
                    i++;

                } else {
                    j++;
                }
            }
            System.out.println("Prezentele");
            System.out.println(i);
            System.out.println("Absentele");
            System.out.println(j);
        }

        //de reviziuit pe acasa cu lambda count; !!
    }

    private void checkStarted() {
        if (listOfLessons == null ) {
            throw new NotStartedException();
        }
    }
}
