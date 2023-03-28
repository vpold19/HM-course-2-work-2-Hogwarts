package hogwarts;

public class HufflepuffStudent extends HogwartsStudent {
    private int diligence;
    private int loyalty;
    private int honesty;
    public HufflepuffStudent(String name, int magic, int transgression,
                             int diligence, int loyalty, int honesty) {
        super(name, magic, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    @Override
    public int ability() {
        return diligence + loyalty + honesty;
    }

    @Override
    public String tribeName() {
        return "Пуфендуец";
    }
    public void compareHufflepuff(HufflepuffStudent hufflepuffStudent){
        compare(hufflepuffStudent);
    }

    @Override
    public String toString() {
        return String.format("%s; трудолюбивы честны: %d; верны: %d; честны: %d",super.toString(), diligence, loyalty, honesty);
    }
}
