package pro.sky.java.course2.homework1;

public class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, String surname, int magic, int teleportation, int intelligence, int wisdom, int wit, int creativity) {
        super(name, surname, magic, teleportation);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
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

    public void printPeople() {
        super.printPeople();
        System.out.println("Свойства Когтевранцев: ");
        System.out.println("Умность: " + intelligence);
        System.out.println("Мудрость: " + wisdom);
        System.out.println("Остроумие: " + wit);
    }
    public void compareWith(Ravenclaw student) {
        int sum1 = student.intelligence + student.wisdom + student.wit;
        int sum2 = this.intelligence + this.wisdom + this.wit;
        if (sum1 > sum2) {
            System.out.println(student.getName() + " является лучшим учеником Когтеврана.");
        } else if (sum1 < sum2) {
            System.out.println(this.getName() + " является лучшим учеником Когтеврана.");
        } else {
            System.out.println("У " + student.getName() + " и " + this.getName() + " одинаковая сумма свойств Когтеврана.");
        }
    }

}
