package ooss;

public class Student extends Person {
    private Klass klass;

    public Student(int id, String name, int age) {

        super(id, name, age);
    }

    public void join(Klass klass) {
        this.klass = klass;
    }

    //TODO: the 'this.klass != null' seems redundant so it may be okay to remove it -removed
    public boolean isIn(Klass klass) {
        return this.klass == klass;

    }

    //TODO: " I am a student." String is used multiple times. It may be better to use a local variable. - fixed
    @Override
    public String introduce() {
        String amStudent = "I am a student";
        if (klass == null) {
            return super.introduce().concat(" I am a student.");
        }
        if (klass.isLeader(this)) {
            return super.introduce().concat(" " + amStudent + ". I am the leader of class ") + klass.getKlassNumber() + ".";

        }
        return super.introduce().concat(" " + amStudent + ".")
                .concat(" I am in class " + klass.getKlassNumber() + ".");

    }


    public Klass getKlass() {
        return this.klass;
    }


}
