package ooss;

public class Student extends Person {
    private  Klass klass;
    private int studentKlassNumber;
    public Student(int id, String name, int age){
        super(id, name, age);
    }

    public void join(Klass klass){
       studentKlassNumber = klass.getKlassNumber();
    }
    public boolean isIn(Klass klass) {
        return klass.getKlassNumber() == studentKlassNumber;

    }
    @Override
    public String introduce(){
        return super.introduce().concat(" I am a student.")
                .concat(" I am in class "+ studentKlassNumber+ ".");

    }


}
