package ooss;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private final int number;
    private Student leader;
    private List<Person> listOfPerson = new ArrayList<>();

    //TODO: fix indention of the for loop - done
    //TODO: similar Strings aside from one word. It may be better to use a local variable. - done
    //TODO: remove the case of else inside the for loop. it's not included in the requirement. - done
    public void assignLeader(Student student) {
        String doNotBelong = "It is not one of us.";
        if (student.isIn(this)) {
            this.leader = student;
        } else {
            System.out.println(doNotBelong);
        }
        for (Person person : listOfPerson) {
            if (person instanceof Student) {
                System.out.print("I am " + person.getName() + ", student of Class " + number + ". I know " + student.getName() + " become Leader.");
            } else if (person instanceof Teacher) {
                System.out.print("I am " + person.getName() + ", teacher of Class " + number + ". I know " + student.getName() + " become Leader.");
            }
        }

    }

    public void attach(Person person) {
        listOfPerson.add(person);
    }

    public boolean isLeader(Student student) {
        return leader != null && leader.equals(student);
    }

    public int getKlassNumber() {
        return number;
    }

    public Klass(int number) {

        this.number = number;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Klass klass = (Klass) o;

        return number == klass.number;
    }

    @Override
    public int hashCode() {
        return number;
    }
}
