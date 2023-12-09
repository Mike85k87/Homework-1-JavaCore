package pro.sky.java.course2.homework1;

public class Hogwarts {
    private String name;
    private String surname;
    private int magic;
    private int teleportation;
    public Hogwarts(String name, String surname, int magic, int teleportation) {
        this.name = name;
        this.surname = surname;
        this.magic = magic;
        this.teleportation = teleportation;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getMagic() {
        return magic;
    }
    public void setMagic(int magic) {
        this.magic = magic;
    }
    public int getTeleportation() {
        return teleportation;
    }
    public void setTeleportation(int teleportation) {
        this.teleportation = teleportation;
    }
    public void printPeople() {
        System.out.println("Ученик: " + getName() + " " + getSurname());
        System.out.println("Магия: " + getMagic() + ", телепортация: " + getTeleportation());
    }
    public static void compareStudents(Hogwarts student1, Hogwarts student2) {
        int magicalPower1 = student1.getMagic();
        int magicalPower2 = student2.getMagic();

        int teleportDistance1 = student1.getTeleportation();
        int teleportDistance2 = student2.getTeleportation();

        if (magicalPower1 > magicalPower2) {
            System.out.println(student1.getName() + " превосходит " + student2.getName() + " по силе магии.");
        } else if (magicalPower1 < magicalPower2) {
            System.out.println(student2.getName() + " превосходит " + student1.getName() + " по силе магии.");
        } else {
            System.out.println("Сравнение между " + student1.getName() + " и " + student2.getName() + " невозможно, так как их силы равны.");
        }
        if (teleportDistance1 > teleportDistance2) {
            System.out.println(student1.getName() + " превосходит " + student2.getName() + " по трансгерссии.");
        } else if (teleportDistance1 < teleportDistance2) {
            System.out.println(student2.getName() + " превосходит " + student1.getName() + " по трансгрессии.");
        } else {
            System.out.println("Сравнение между " + student1.getName() + " и " + student2.getName() + " невозможно, так как их силы равны.");

        }
    }
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Гарри",  "Поттер", 10, 23, 45, 75, 95);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона", "Грейнджер", 55, 22, 15, 93, 80);
        Gryffindor ronWeasley = new Gryffindor("Рон" ,"Уизли", 76, 2, 10, 65, 85);

        Slytherin dracoMalfoy = new Slytherin("Драко",  "Малфой", 85, 56, 45, 95, 80, 22,25);
        Slytherin grahamMontague = new Slytherin("Грэхэм", "Монтегю", 85, 83, 33, 75, 90,11,48);
        Slytherin gregoryGoyle = new Slytherin("Грегори",  "Гойл", 75, 67, 80, 95, 85, 11,21);

        Hufflepuff zachariasSmith = new Hufflepuff("Захария" ,"Смит", 14, 34, 90, 45, 80);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик",  "Диггори", 90, 56, 80, 85, 85);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин", "Финч-Флетчли", 56, 81, 90, 80, 80);

        Ravenclaw choChang = new Ravenclaw("Чжоу"," Чанг", 85, 45, 34, 85, 80,15);
        Ravenclaw padmaPatil = new Ravenclaw("Падма"," Патил", 90, 67, 4, 78, 85,10);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус"," Белби", 8, 78, 88, 75, 31,11);

        harryPotter.printPeople();
        harryPotter.compareWith(hermioneGranger);
        dracoMalfoy.printPeople();
        gregoryGoyle.compareWith(grahamMontague);
        zachariasSmith.printPeople();
        cedricDiggory.compareWith(justinFinchFletchley);
        choChang.printPeople();
        padmaPatil.compareWith(marcusBelby);
        compareStudents(justinFinchFletchley,grahamMontague);
    }
}
