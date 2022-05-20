public class RavenclawStudent extends HogwartsStudent {
    private final int trick;
    private final int wise;
    private final int witty;
    private final int creative;

    public RavenclawStudent(String firstName, String lastName, int witchcraft, int transgression,
                            int trick, int wise, int witty, int creative) {
        super(firstName, lastName, witchcraft, transgression);
        if (trick >= 0 && trick <= 100 && wise >= 0 && wise <= 100 && witty >= 0 &&
                witty <= 100 && creative >= 0 && creative <= 100) {
            this.trick = trick;
            this.wise = wise;
            this.witty = witty;
            this.creative = creative;
        } else {
            throw new IllegalArgumentException("Введите корректные значения");
        }
    }



    public void printInfo() {
        System.out.println("Качества студента Когтеврана " + super.toString() +
                ": колдовство " + super.getWitchcraft() + ", трансгрессия " + super.getTransgression() +
                ", ум " + trick + ", мудрость " + wise + ", остроумие " + witty + ", творчество " + creative);
    }

    public void compareWith(RavenclawStudent ravenclawStudent) {
        int thisStudentScore = this.getWitchcraft() + this.getTransgression() + this.witty + this.wise + this.trick + this.creative;
        int ravenclawStudentScore = ravenclawStudent.getWitchcraft() + ravenclawStudent.getWitchcraft() + ravenclawStudent.trick +
                ravenclawStudent.wise + ravenclawStudent.witty + ravenclawStudent.creative;
        if (ravenclawStudentScore > thisStudentScore) {
                System.out.println(ravenclawStudent.toString() + " лучший Когтевранец, чем " + this.toString());
            } else if (ravenclawStudentScore == thisStudentScore) {
                System.out.println(ravenclawStudent.toString() + " такой же Когтевранец, как и " + this.toString());
            } else {
                System.out.println(this.toString() + " лучший Когтевранрец, чем " + ravenclawStudent.toString());
            }
    }

}
