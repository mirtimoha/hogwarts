public class Hufflepuff extends Hogwarts{
    private final int industriousness;
    private final int loyalty;
    private final int honesty;

    public Hufflepuff(String name, String lastName, int witchcraft, int transgressAbility, int industriousness,
                      int loyalty, int honesty) {
        super(name, lastName, witchcraft, transgressAbility);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }
    public void compareStudentsInFaculty(Hufflepuff student) {
        if (this.industriousness + this.loyalty + this.honesty > student.industriousness + student.loyalty + student.honesty) {
            System.out.println(this.getName() + " " + this.getLastName() + " лучший Пуффендуец, чем " +
                    student.getName() + " " + student.getLastName());
        } else {
            System.out.println(student.getName() + " " + student.getLastName() + " лучший Пуффендуец, чем " +
                    this.getName() + " " + this.getLastName());
        }
    }
    @Override
    public String toString() {
        return this.getName() + " " + this.getLastName() + "\nТрудолюбие: " + this.industriousness +
                "\nВерность: " + this.loyalty + "\nЧестность: " + this.honesty + this.property();
    }
}
