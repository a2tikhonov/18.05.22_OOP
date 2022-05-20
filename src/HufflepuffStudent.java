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
        } else throw new IllegalArgumentException("Введите корректные значения");
    }



    public void printInfo() {
        System.out.println("Качества студента Пуффендуйя " + super.toString() +
                ": колдовство " + super.getWitchcraft() + ", трансгрессия " + super.getTransgression() +
                ", трудолюбие " + industriousness + ", верность " + loyalty + ", честность " + honesty);
    }

    public void compareWith(Object hufflepuffStudent) {
        if (hufflepuffStudent.getClass() == this.getClass()) {
            if (((HufflepuffStudent) hufflepuffStudent).getWitchcraft() +
                    ((HufflepuffStudent) hufflepuffStudent).getWitchcraft() +
                    ((HufflepuffStudent) hufflepuffStudent).industriousness +
                    ((HufflepuffStudent) hufflepuffStudent).loyalty +
                    ((HufflepuffStudent) hufflepuffStudent).honesty > this.getWitchcraft() +
                    this.getTransgression() + this.honesty + this.loyalty + this.industriousness) {
                System.out.println(hufflepuffStudent.toString() + " лучший Пуффендуйец, чем " + this.toString());
            } else System.out.println(this.toString() + " лучший Пуффендуйец, чем " + hufflepuffStudent.toString());
        }
    }

}