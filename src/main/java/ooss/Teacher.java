package ooss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person {
    private int teacherKlassNumber;
    private Klass klass;
    private List<Klass> listOfKlass  = new ArrayList<>();
    public Teacher(int id, String name, int age){
        super(id, name, age);
    }


    public void assignTo(Klass klass) {
        this.listOfKlass.add(klass);
    }
    public boolean belongsTo(Klass klassFinder) {
        return this.listOfKlass.contains(klassFinder);

    }
    @Override
    public String introduce() {
        return super.introduce().concat(" I am a teacher." ).concat(" I teach Class "+ createKlassesLine(getListOfMultipleKlass()) + ".");
    }

    public boolean isTeaching(Student student) {
        return this.listOfKlass.contains(student.getStudentKlass());
    }

    public List<Klass> getListOfKlass(){
        return listOfKlass;
    }
    public List<Integer> getListOfMultipleKlass(){
        return this.listOfKlass.stream()
                .map(Klass::getKlassNumber)
                .collect(Collectors.toList());
    }
    public String createKlassesLine(List<Integer> listOfKlasses){
        StringBuilder klassNumberLine = new StringBuilder();
        listOfKlasses.forEach(numberOfKlass -> klassNumberLine.append(numberOfKlass)
                .append(", "));
        return klassNumberLine.deleteCharAt(klassNumberLine.length()-2).toString().trim();

    }
}
