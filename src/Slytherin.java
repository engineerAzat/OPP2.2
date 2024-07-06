public class Slytherin extends Hogwarts{

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lust;

    public Slytherin(String name, int magicPower, int transgressionDistanse, int cunning, int determination, int ambition, int resourcefulness, int lust) {
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

}
