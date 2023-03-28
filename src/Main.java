import hogwarts.GryffindorStudent;
import hogwarts.HufflepuffStudent;
import hogwarts.RavenclawStudent;

import java.util.Random;

public class Main {
    private static final Random random= new Random();
    public static void main(String[] args) {
        GryffindorStudent harry = generateGryffindorStudent("Гарри Поттер");
        GryffindorStudent ron = generateGryffindorStudent("Рон Уизли");
        GryffindorStudent hermiona = generateGryffindorStudent("Гермиона Грейнджер");
        HufflepuffStudent zaharia = generateHufflepuffStudent("Захария Смит");
        HufflepuffStudent sedrik = generateHufflepuffStudent("Седрик Диггори");
        HufflepuffStudent justin = generateHufflepuffStudent("Джастин Финч-Флетчли");
        RavenclawStudent chang = generateRavenclawStudent("Чжоу Чанг");
        RavenclawStudent padma = generateRavenclawStudent(" Падма Патил");
        RavenclawStudent marcos = generateRavenclawStudent("Маркус Белби");
        SlytherinStudent drako = generateSlytherinStudent("Драко Малфой");
        SlytherinStudent grackem = generateSlytherinStudent("Грэхэм Монтегю");
        SlytherinStudent gregory = generateSlytherinStudent("Грегори Гойл");

        harry.print();
        ron.print();
        hermiona.print();
        zaharia.print();
        sedrik.print();
        justin.print();
        chang.print();
        padma.print();
        marcos.print();
        drako.print();
        grackem.print();
        gregory.print();

        harry.compareGryffindor(hermiona);
        harry.compareAbilitiesHogwarts(drako);
        sedrik.compareHufflepuff(zaharia);
        sedrik.compareAbilitiesHogwarts(ron);
        chang.compareRavenclaw(padma);
        chang.compareAbilitiesHogwarts(justin);
        grackem.compareSlytherin(gregory);
        grackem.compareAbilitiesHogwarts(harry);

    }
    private static GryffindorStudent generateGryffindorStudent(String name){
        return new GryffindorStudent(
                name,
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100)
                );
    }
    private static HufflepuffStudent generateHufflepuffStudent(String name){
        return new HufflepuffStudent(
                name,
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100)
                );
    }
    private static RavenclawStudent generateRavenclawStudent(String name){
        return new RavenclawStudent(
                name,
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100)
                );
    }
    private static SlytherinStudent generateSlytherinStudent(String name){
        return new SlytherinStudent(
                name,
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100)
        );
    }
}