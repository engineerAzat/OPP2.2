public class Gryffindor extends Hogwarts{

    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int magicPower, int transgressionDistanse, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistanse);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }
}
