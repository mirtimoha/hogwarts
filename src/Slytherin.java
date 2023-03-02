public class Slytherin extends Hogwarts {

    private final int cunning;
    private final int resoluteness;
    private final int ambition;
    private final int inventiveness;
    private final int powerLust;

    public Slytherin(String name, String lastName, int witchcraft, int transgressAbility,
                     int cunning, int resoluteness, int ambition, int inventiveness, int powerLust) {
        super(name, lastName, witchcraft, transgressAbility);
        this.cunning = cunning;
        this.resoluteness = resoluteness;
        this.ambition = ambition;
        this.inventiveness = inventiveness;
        this.powerLust = powerLust;
    }
    public void compareStudentsInFaculty(Slytherin student) {
        if (this.cunning + this.resoluteness + this.ambition + this.inventiveness + this.powerLust
                > student.cunning + student.resoluteness + student.ambition + student.inventiveness + student.powerLust) {
            System.out.println(this.getName() + " " + this.getLastName() + " лучший Слизеринец, чем " +
                    student.getName() + " " + student.getLastName());
        } else {
            System.out.println(student.getName() + " " + student.getLastName() + " лучший Слизеринец, чем " +
                    this.getName() + " " + this.getLastName());
        }
    }
    @Override
    public String toString() {
        return this.getName() + " " + this.getLastName() + "\nХитрость: " + this.cunning +
                "\nРешительность: " + this.resoluteness + "\nАмбициозность: " + this.ambition +
                "\nНаходчиость: " + this.inventiveness + "\nЖажда власти: " + this.powerLust + this.property();
    }
}
