import hogwarts.HogwartsStudent;

public class SlytherinStudent extends HogwartsStudent {
    private int cunning;
    private int determination;
    private int ambition;
    private int ingenuity;
    private int thirstForPower;

    public SlytherinStudent(String name, int magic, int transgression,
                            int cunning, int determination, int ambition, int ingenuity, int thirstForPower) {
        super(name, magic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this. ambition = ambition;
        this.ingenuity = ingenuity;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getIngenuity() {
        return ingenuity;
    }

    public void setIngenuity(int ingenuity) {
        this.ingenuity = ingenuity;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }
    @Override
    public int ability() {
        return cunning + determination + ambition + ingenuity + thirstForPower;
    }

    @Override
    public String tribeName() {
        return "Слизоронец";
    }
    public void compareSlytherin(SlytherinStudent slytherinStudent){
        compare(slytherinStudent);
    }

    @Override
    public String toString() {
        return String.format("%s; хитрость и жажда власти: %d; , решительность: %d; амбициозность: %d; находчивость: %d; жажда власти: %d",super.toString(), cunning, determination, ambition, ingenuity, thirstForPower);
    }
}
