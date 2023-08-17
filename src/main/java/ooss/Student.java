package ooss;

public class Student extends Person {
    private  Klass klass;
    public Student(int id, String name, int age){

        super(id, name, age);
    }

    public void join(Klass klass){
       this.klass = klass;
    }
    public boolean isIn(Klass klass) {
        return this.klass == klass && this.klass !=null;

    }
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
