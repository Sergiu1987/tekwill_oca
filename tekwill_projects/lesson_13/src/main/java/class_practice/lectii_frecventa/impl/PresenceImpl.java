package class_practice.lectii_frecventa.impl;

import class_practice.lectii_frecventa.Group;
import class_practice.lectii_frecventa.api.Character;
import class_practice.lectii_frecventa.api.Presence;

import java.util.ArrayList;
import java.util.List;

public class PresenceImpl implements Presence {
    private Group group;
    private List<Staff> presentStaff;


    public PresenceImpl(Group group) {
        this.group = group;
        presentStaff = new ArrayList<>();

    }

    @Override
    public boolean isPresent(Character character) {
        return presentStaff.contains(character);
    }

    @Override
    public void check() {
        group.students().forEach(s -> {
            if (Math.random() > 0.3)
                presentStaff.add(s);
        });
// 2 proffesori dupa vin altii doi si de fiecaredata diferiti ! .
        if (Math.random() > 0.5) {
            presentStaff.add(group.professors().get(0));
            presentStaff.add(group.professors().get(1));
        } else {
            presentStaff.add(group.professors().get(2));
            presentStaff.add(group.professors().get(3));
        }
    }






}
