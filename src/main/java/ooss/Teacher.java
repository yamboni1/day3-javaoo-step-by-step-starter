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

    @Override
    public String introduce() {
        return super.introduce().concat(" I am a teacher." );
    }
    public void assignTo(Klass klass) {
        this.listOfKlass.add(klass);
    }
    public boolean belongsTo(Klass klassFinder) {
        return this.listOfKlass.contains(klassFinder);

    }

    public boolean isTeaching(Student student) {
        return this.listOfKlass.contains(student.getStudentKlass());
    }
}
