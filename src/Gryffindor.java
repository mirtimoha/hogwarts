public class Gryffindor extends Hogwarts{
    private final int nobility;
    private final int honor;
    private final int bravery;
    public Gryffindor(String name, String lastName, int witchcraft, int transgressAbility, int nobility,
                      int honor, int bravery) {
        super(name, lastName, witchcraft, transgressAbility);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }
    public void compareStudentsInFaculty(Gryffindor student) {
        if (this.nobility + this.honor + this.bravery > student.nobility + student.honor + student.bravery) {
            System.out.println(this.getName() + " " + this.getLastName() + " лучший Гриффиндорец, чем " +
                    student.getName() + " " + student.getLastName());
        } else {
            System.out.println(student.getName() + " " + student.getLastName() + " лучший Гриффиндорец, чем " +
                    this.getName() + " " + this.getLastName());
        }
    }
    @Override
    public String toString() {
        return this.getName() + " " + this.getLastName() + "\nБлагородство: " + this.nobility +
                "\nЧесть: " + this.honor + "\nХрабрость: " + this.bravery + this.property();
    }
}
