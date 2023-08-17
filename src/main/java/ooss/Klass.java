package ooss;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private final int number;
    private Student leader;
    private List<Person> listOfPerson  = new ArrayList<>();

    //TODO: fix indention of the for loop
    //TODO: similar Strings aside from one word. It may be better to use a local variable.
    //TODO: remove the case of else inside the for loop. it's not included in the requirement.
    public void assignLeader(Student student) {
        if (student.isIn(this)) {
            this.leader = student;
        }else{
            System.out.println("It is not one of us.");
        }
            for ( Person person: listOfPerson) {
                if(person instanceof  Student){
                    System.out.print("I am " + person.getName()+  ", student of Class " + number + ". I know " + student.getName() + " become Leader.");
                } else if (person instanceof Teacher) {
                    System.out.print("I am " + person.getName()+  ", teacher of Class " + number + ". I know " + student.getName() + " become Leader.");
                }else{
                    System.out.println("It is not one of us.");
                }
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
    public Klass(int number){

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
