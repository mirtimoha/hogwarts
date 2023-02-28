public class Hogwarts {
    private final String name;
    private final String lastName;
    private final int witchcraft;
    private final int transgressAbility;

    public Hogwarts(String name, String lastName, int witchcraft, int transgressAbility) {
        this.name = name;
        this.lastName = lastName;
        this.witchcraft = witchcraft;
        this.transgressAbility = transgressAbility;
    }
    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public int getWitchcraft() {
        return witchcraft;
    }
    public int getTransgressAbility() {
        return transgressAbility;
    }
    public String property() {
        return "\nКолдовство: " + this.witchcraft + "\nУмение трансгрессировать: " + this.transgressAbility + "\n";
    }
    public void compareStudents(Hogwarts student) {
        if (this.transgressAbility + this.witchcraft > student.transgressAbility + student.witchcraft) {
            System.out.println(this.name + " " + this.lastName + " обладает большей мощностью магии, чем " +
                    student.name + " " + student.lastName);
        } else {
            System.out.println(student.name + " " + student.lastName + " обладает большей мощностью магии, чем " +
                    this.name + " " + this.lastName);
        }
    }
}
