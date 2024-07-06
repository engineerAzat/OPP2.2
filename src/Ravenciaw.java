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
}
