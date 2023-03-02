public class Main {

    public static void main(String[] args) {

        Gryffindor potter = new Gryffindor("Harry", "Potter", 80, 85,
                70, 75, 70);
        Gryffindor granger = new Gryffindor("Hermione", "Granger", 100, 70,
                70, 70, 70);
        Gryffindor weasley = new Gryffindor("Ron", "Weasley", 60, 60,
                70,70,70);

        Slytherin malfoy = new Slytherin("Draco", "Malfoy", 70, 70,
                80,80,80, 80, 80);
        Slytherin montagu = new Slytherin("Graham", "Montagu", 70, 70,
                80,80,80, 80, 80);
        Slytherin goyle = new Slytherin("Gregory", "Goyle", 70, 70,
                80,80,80, 80, 80);

        Hufflepuff smith = new Hufflepuff("Zacharias", "Smith", 70, 70,
                80,80,80);
        Hufflepuff diggory = new Hufflepuff("Cedric", "Diggory", 70, 70,
                80,80,80);
        Hufflepuff finch = new Hufflepuff("Justin", "Finch-Fletchley", 70, 70,
                80,80,80);

        Ravenclaw chang = new Ravenclaw("Zhou", "Chang", 70, 70,
                80,80,80, 80);
        Ravenclaw patil = new Ravenclaw("Padma", "Patil", 70, 70,
                80,80,80, 80);
        Ravenclaw belby = new Ravenclaw("Marcus", "Belby", 70, 70,
                80,80,80, 80);
        System.out.println(potter);
        granger.compareStudentsInFaculty(potter);
        weasley.compareStudents(chang);
    }

}