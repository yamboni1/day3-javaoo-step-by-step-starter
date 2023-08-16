package ooss;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private final int number;
    private Student leader;
    private List<Person> listOfPerson  = new ArrayList<>();

    public Klass(int number){

        this.number = number;

    }

    public void assignLeader(Student student) {
        if (student.isIn(this)) {
            this.leader = student;
        }else{
            System.out.println("It is not one of us.");
        }



    }
    public void attach(Person person) {
        listOfPerson.add(person);
    }
    public boolean isLeader(Student student){
        return leader != null && leader.equals(student);
    }
    public int getKlassNumber(){
        return number;
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
