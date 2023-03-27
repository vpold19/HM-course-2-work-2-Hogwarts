public abstract class HogwartsStudent {
    private String name;
    private int magic;
    private int transgression;


    public HogwartsStudent(String name, int magic, int transgression) {
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }
private int abilityPower(){
        return transgression + magic;
}
public abstract int ability();
public void compareAbilitiesHogwarts(HogwartsStudent hogwartsStudent){
        int ability1 = abilityPower();
        int ability2 = hogwartsStudent.abilityPower();
        if (ability1>ability2){
            System.out.printf("Студент %s лучше, чем студент %s: %d VS %d%n", getName(), hogwartsStudent.getName(), ability1, ability2);
        } else if (ability2>ability1) {
            System.out.printf("Студент %s лучше, чем студент %s: %d VS %d%n", hogwartsStudent.getName(), getName(), ability2, ability1);
        }  else{
            System.out.printf("Студент %d такой же, как студент %s: %d VS %d%n", hogwartsStudent.getName(), getName(), ability1, ability2 );
        }
}
}
