public class GryffindorStudent extends HogwartsStudent {
    private final int nobility;
    private final int honor;
    private final int bravery;

    public GryffindorStudent(String firstName, String lastName, int witchcraft, int transgression,
                             int nobility, int honor, int bravery) {
        super(firstName, lastName, witchcraft, transgression);
        if (nobility >= 0 && nobility <= 100 && honor >= 0 && honor <= 100 && bravery >= 0 && bravery <= 100) {
            this.nobility = nobility;
            this.honor = honor;
            this.bravery = bravery;
        } else {
            throw new IllegalArgumentException("Введите корректные значения");
        }
    }



    public void printInfo() {
        System.out.println("Качества студента Гриффиндора " + super.toString() +
                ": колдовство " + super.getWitchcraft() + ", трансгрессия " + super.getTransgression() +
                ", благородство " + nobility + ", честь " + honor + ", храбрость " + bravery);
    }

    public void compareWith(GryffindorStudent gryffindorStudent) {
            int thisStudentScore = this.getWitchcraft() + this.getTransgression() + this.nobility + this.honor + this.bravery;
            int gryffindorStudentScore = gryffindorStudent.getWitchcraft() + gryffindorStudent.getWitchcraft() + gryffindorStudent.bravery +
                    gryffindorStudent.honor + gryffindorStudent.nobility;
            if (gryffindorStudentScore > thisStudentScore) {
                System.out.println(gryffindorStudent.toString() + " лучший Гриффиндорец, чем " + this.toString());
            } else if (gryffindorStudentScore == thisStudentScore) {
                System.out.println(gryffindorStudent.toString() + " такой же Гриффиндорец, как и " + this.toString());
            } else {
                System.out.println(this.toString() + " лучший Гриффиндорец, чем " + gryffindorStudent.toString());
            }
    }

}
