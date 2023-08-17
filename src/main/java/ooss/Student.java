package ooss;

public class Student extends Person {
    private  Klass klass;
    public Student(int id, String name, int age){

        super(id, name, age);
    }

    public void join(Klass klass){
       this.klass = klass;
    }

    //TODO: the 'this.klass != null' seems redundant so it may be okay to remove it
    public boolean isIn(Klass klass) {
        return this.klass == klass && this.klass !=null;

    }
    //TODO: " I am a student." String is used multiple times. It may be better to use a local variable.
    @Override
    public String introduce(){
        if(klass != null){
            if(klass.isLeader(this)){
                return super.introduce().concat(" I am a student. I am the leader of class ") + klass.getKlassNumber() + ".";

            }else{
                return super.introduce().concat(" I am a student.")
                        .concat(" I am in class "+ klass.getKlassNumber()+ ".");
            }
        }
        return super.introduce().concat(" I am a student.");
    }
    public Klass getKlass(){ return this.klass;}


}
