public class Ravenclaw extends Hogwarts{

    private final int cleverness;
    private final int wit;
    private final int creativity;
    private final int wisdom;

    public Ravenclaw(String name, String lastName, int witchcraft, int transgressAbility,
                     int cleverness, int wit, int creativity, int wisdom) {
        super(name, lastName, witchcraft, transgressAbility);
        this.cleverness = cleverness;
        this.wit = wit;
        this.creativity = creativity;
        this.wisdom = wisdom;
    }
    public void compareStudentsInFaculty(Ravenclaw student) {
        if (this.cleverness + this.wit + this.creativity + this.wisdom
                > student.cleverness + student.wit + student.creativity + student.wisdom) {
            System.out.println(this.getName() + " " + this.getLastName() + " лучший Когтевранец, чем " +
                    student.getName() + " " + student.getLastName());
        } else {
            System.out.println(student.getName() + " " + student.getLastName() + " лучший Когтевранец, чем " +
                    this.getName() + " " + this.getLastName());
        }
    }
    @Override
    public String toString() {
        return this.getName() + " " + this.getLastName() + "\nУм: " + this.cleverness +
                "\nОстроумие: " + this.wit + "\nКреативность: " + this.creativity +
                "\nМудрость: " + this.wisdom + this.property();
    }
}
