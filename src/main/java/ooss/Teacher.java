package ooss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person {
    public Teacher(int id, String name, int age){
        super(id, name, age);
    }

    @Override
    public String introduce() {
        return super.introduce().concat(" I am a teacher." );
    }
}
