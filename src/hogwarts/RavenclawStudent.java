package hogwarts;

public class RavenclawStudent extends HogwartsStudent {
    private int cleverness;
    private int wisdom;
    private int wit;
    private int creativity;

    public RavenclawStudent(String name, int magic, int transgression,
                            int cleverness, int wisdom, int wit, int creativity) {
        super(name, magic, transgression);
        this.cleverness = cleverness;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getCleverness() {
        return cleverness;
    }

    public void setCleverness(int cleverness) {
        this.cleverness = cleverness;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
@Override
    public int ability() {
        return cleverness + wisdom + creativity + wit;
    }

    @Override
    public String tribeName() {
        return "Когтевранец";
    }
    public void compareRavenclaw(RavenclawStudent ravenclawStudent){
        compare(ravenclawStudent);
    }

    @Override
    public String toString() {
        return String.format("%s; умны полны творчества: %d; мудры: %d; остроумны: %d; полны творчества: %d",super.toString(), cleverness, wisdom, creativity, wit);
    }
}
