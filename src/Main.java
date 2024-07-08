public class Main {
    public static void main(String[] args) {

        Hogwarts dambledore = new Hogwarts ("Albus", 100, 100);

        Gryffindor harry = new Gryffindor("Harry Potter", 54,23,32,56,23);
        Gryffindor germiona = new Gryffindor("Germiona Greindger", 35, 22, 45, 12, 45);
        Gryffindor ron = new Gryffindor("Ron Uizli", 75, 21, 3, 5, 76);
        harry.compare(ron);
        System.out.println(harry.toString());

        Slytherin drako = new Slytherin("Drako Malfou", 1, 24, 56, 23,12,33,21);
        Slytherin grehem = new Slytherin("Grehem Montegu", 1, 15, 34,15, 10, 8, 46 );
        Slytherin gregori = new Slytherin("Gregori Goil", 2, 10, 15, 31, 9, 10, 7);
        harry.compare(drako);
        System.out.println(drako.toString());

        Hufflepuff zaharia = new Hufflepuff("Zaharia Smit", 2, 3, 15, 23,10);
        Hufflepuff sedrik = new Hufflepuff("Sedrik Diggori", 5, 4, 34, 21, 13);
        Hufflepuff dgastin = new Hufflepuff("Dgastin Finth- Fletthli", 2, 45, 12, 13, 37);
        sedrik.compare(zaharia);
        zaharia.compare(harry);
        System.out.println(zaharia.toString());

        Ravenciaw goy = new Ravenciaw("Goy Gang", 15, 10, 15, 3, 5,4);
        Ravenciaw padma = new Ravenciaw("Padma Patil", 5, 1, 35, 13, 35,41);
        Ravenciaw markus = new Ravenciaw("Markus Balby", 22, 7, 15, 32, 15,14);
        goy.compare(harry);
        System.out.println(goy.toString());


    }
}