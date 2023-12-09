package pro.sky.java.course2.homework1;

class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;
    public Gryffindor (String name, String surname, int magic, int teleportation, int nobility, int honor, int bravery) {
        super(name, surname , magic, teleportation);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public void printPeople() {
        super.printPeople();
        System.out.println("Свойства Гриффиндорцев: ");
        System.out.println("Благородство: " + nobility);
        System.out.println("Честь: " + honor);
        System.out.println("Храбрость: " + bravery);

    }
    public void compareWith(Gryffindor student) {
        int sum1 = student.nobility + student.honor + student.bravery;
        int sum2 = this.nobility + this.honor + this.bravery;

        if (sum1 > sum2) {
            System.out.println(student.getName() + " является лучшим учеником Гриффиндора.");
        } else if (sum1 < sum2) {
            System.out.println(this.getName() + " является лучшим учеником Гриффиндора.");
        } else {
            System.out.println("У " + student.getName() + " и " + this.getName() + " одинаковая сумма свойств Гриффиндора.");
        }
    }
}
