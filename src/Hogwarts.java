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

    public String decsription(){
        return "Имя" + name + ", сила магии: " + magicPower + ", сила трансгрессирования:" + transgressionDistanse;
    }

    public int sum(){
        return magicPower + transgressionDistanse;
    }

    public void compare(Hogwarts other) {
        if (magicPower > other.magicPower) {
            System.out.println(name + " обладает большей мощностью магии, чем " + other.name);
        } else {
            System.out.println(other.name + " обладает большей мощностью магии, чем " + name);
        }

        if (transgressionDistanse > other.transgressionDistanse) {
            System.out.println(name + " обладает большей дистанцией магии, чем " + other.name);
        } else {
            System.out.println(other.name + " обладает большей дистанцией магии, чем " + name);
        }
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", magicPower=" + magicPower +
                ", transgressionDistanse=" + transgressionDistanse +
                '}';
    }
}

