public class Gryffindor extends Hogwarts{

    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name,
                      int magicPower,
                      int transgressionDistanse,
                      int nobility,
                      int honor,
                      int bravery) {
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

    public  int sum(){
        return nobility + honor + bravery;
    }

    public void compare(Gryffindor other) {
        var s1 = this.sum();
        var s2 = other.sum();
        if (s1 > s2) {
            System.out.println(this.getName() + " лучший Гриффиндорец чем " + other.getName());
        } else {
            System.out.println(other.getName() + " лучший Гриффиндорец чем " + this.getName());
        }
    }


        @Override
    public String toString() {
        return super.toString() + "Gryffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }
}
