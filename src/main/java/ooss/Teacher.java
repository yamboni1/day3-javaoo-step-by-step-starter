package ooss;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//TODO: remove unused import statement java.util.Collections - removed
public class Teacher extends Person {

    //TODO: remove attribute klass since it is never used - removed

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

    //TODO: " I am a teacher." String is used twice. It may be better to use a local variable - fixed
    @Override
    public String introduce() {
        String isTeacher = " I am a teacher.";
        if(getListOfKlass().isEmpty()){
            return super.introduce().concat(isTeacher);
        }
        return super.introduce().concat(isTeacher).concat(" I teach Class "+ createKlassesLine(getListOfMultipleKlass()) + ".");
    }

    public boolean isTeaching(Student student) {
        return this.listOfKlass.contains(student.getKlass());
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
