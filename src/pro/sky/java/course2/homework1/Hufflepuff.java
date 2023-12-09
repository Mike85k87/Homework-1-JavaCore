package pro.sky.java.course2.homework1;

public class Hufflepuff extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, String surname, int magic, int teleportation, int diligence, int loyalty, int honesty) {
        super(name, surname, magic, teleportation);
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

    public void printPeople() {
        super.printPeople();
        System.out.println("Свойства Пуффендуев: ");
        System.out.println("Трудолюбие: " + diligence);
        System.out.println("Верность: " + loyalty);
        System.out.println("Честность: " + honesty);
    }

    public void compareWith(Hufflepuff student) {
        int sum1 = student.diligence + student.loyalty + student.honesty;
        int sum2 = this.diligence + this.loyalty + this.honesty;
        if (sum1 > sum2) {
            System.out.println(student.getName() + " является лучшим учеником Пуффендуя.");
        } else if (sum1 < sum2) {
            System.out.println(this.getName() + " является лучшим учеником Пуффендуя.");
        } else {
            System.out.println("У " + student.getName() + " и " + this.getName() + " одинаковая сумма свойств Пуффендуя.");
        }
    }
}