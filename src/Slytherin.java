public class Slytherin extends Hogwarts{

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lust;

    public Slytherin(String name,
                     int magicPower,
                     int transgressionDistanse,
                     int cunning,
                     int determination,
                     int ambition,
                     int resourcefulness,
                     int lust) {
        super(name, magicPower, transgressionDistanse);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lust = lust;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLust() {
        return lust;
    }

    public  int sum(){
        return cunning + determination + ambition + resourcefulness + lust;
    }

    public void compare(Slytherin other) {
        var s1 = this.sum();
        var s2 = other.sum();
        if (s1 > s2) {
            System.out.println(this.getName() + " лучший Слизиринец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " лучший Слизиринец, чем " + this.getName());
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Slytherin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lust=" + lust +
                '}';
    }
}
