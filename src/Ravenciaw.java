public class Ravenciaw extends Hogwarts{

    private int creativity;
    private int witty;
    private int wisdom;
    private int intelligence;

    public Ravenciaw(String name,
                     int magicPower,
                     int transgressionDistanse,
                     int creativity,
                     int witty,
                     int wisdom,
                     int intelligence) {
        super(name, magicPower, transgressionDistanse);
        this.creativity = creativity;
        this.witty = witty;
        this.wisdom = wisdom;
        this.intelligence = intelligence;
    }

    public int getCreativity() {
        return creativity;
    }

    public int getWitty() {
        return witty;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public  int sum(){
        return creativity + witty + wisdom + intelligence;
    }

    public void compare(Ravenciaw other) {
        var s1 = this.sum();
        var s2 = other.sum();
        if (s1 > s2) {
            System.out.println(this.getName() + " лучший Когтевранец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " лучший Когтевранец, чем " + this.getName());
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Ravenciaw{" +
                "creativity=" + creativity +
                ", witty=" + witty +
                ", wisdom=" + wisdom +
                ", intelligence=" + intelligence +
                '}';
    }
}
