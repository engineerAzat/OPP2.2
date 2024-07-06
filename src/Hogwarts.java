public class Hogwarts {

    private String name;
    private int magicPower;
    private int transgressionDistanse;

    public Hogwarts(String name, int magicPower, int transgressionDistanse) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistanse = transgressionDistanse;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistanse() {
        return transgressionDistanse;
    }
}

