public class HufflepuffStudent extends HogwartsStudent {
    private final int industriousness;
    private final int loyalty;
    private final int honesty;

    public HufflepuffStudent(String firstName, String lastName, int witchcraft, int transgression,
                             int industriousness, int loyalty, int honesty) {
        super(firstName, lastName, witchcraft, transgression);
        if (industriousness >= 0 && industriousness <= 100 && loyalty >= 0 && loyalty <= 100 &&
                honesty >= 0 && honesty <= 100) {
            this.industriousness = industriousness;
            this.loyalty = loyalty;
            this.honesty = honesty;
        } else {
            throw new IllegalArgumentException("Введите корректные значения");
        }
    }



    public void printInfo() {
        System.out.println("Качества студента Пуффендуйя " + super.toString() +
                ": колдовство " + super.getWitchcraft() + ", трансгрессия " + super.getTransgression() +
                ", трудолюбие " + industriousness + ", верность " + loyalty + ", честность " + honesty);
    }

    public void compareWith(HufflepuffStudent hufflepuffStudent) {
        int thisStudentScore = this.getWitchcraft() + this.getTransgression() + this.honesty + this.loyalty + this.industriousness;
        int hufflepuffStudentScore = hufflepuffStudent.getWitchcraft() + hufflepuffStudent.getWitchcraft() + hufflepuffStudent.industriousness +
                hufflepuffStudent.loyalty + hufflepuffStudent.honesty;
        if (hufflepuffStudentScore > thisStudentScore) {
                System.out.println(hufflepuffStudent.toString() + " лучший Пуффендуйец, чем " + this.toString());
            } else if (hufflepuffStudentScore == thisStudentScore) {
                System.out.println(hufflepuffStudent.toString() + " такой же Пуффендуйец, как и " + this.toString());
            } else {
                System.out.println(this.toString() + " лучший Пуффендуйец, чем " + hufflepuffStudent.toString());
            }
    }

}