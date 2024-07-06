public class Hufflepuff extends Hogwarts {

    private int diligence;
    private int loyalty;
    private int honest;

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonest() {
        return honest;
    }

    public Hufflepuff(String name, int magicPower, int transgressionDistanse, int diligence, int loyalty, int honest) {
        super(name, magicPower, transgressionDistanse);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honest = honest;


    }
}
