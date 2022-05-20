public class SlytherinStudent extends HogwartsStudent {
    private final int trick;
    private final int resolute;
    private final int ambition;
    private final int resourcefulness;
    private final int overbearing;

    public SlytherinStudent(String firstName, String lastName, int witchcraft, int transgression, int trick,
                            int resolute, int ambition, int resourcefulness, int overbearing) {
        super(firstName, lastName, witchcraft, transgression);
        if (trick >= 0 && trick <= 100 && resolute >= 0 && resolute <= 100 && ambition >= 0 && ambition <= 100 &&
                resourcefulness >= 0 && resourcefulness <= 100 && overbearing >= 0 && overbearing <= 100) {
            this.trick = trick;
            this.resolute = resolute;
            this.ambition = ambition;
            this.resourcefulness = resourcefulness;
            this.overbearing = overbearing;
        } else {
            throw new IllegalArgumentException("Введите корректные значения");
        }
    }



    public void printInfo() {
        System.out.println("Качества студента Слизерина " + super.toString() +
                ": колдовство " + super.getWitchcraft() + ", трансгрессия " + super.getTransgression() +
                ", хитрость " + trick + ", решительность " + resolute + ", амбициозность " + ambition +
                ", находчивость " + resourcefulness + ", жажда власти " + overbearing);
    }

    public void compareWith(SlytherinStudent slytherinStudent) {
        int thisStudentScore = this.getWitchcraft() + this.getTransgression() + this.ambition +
                this.resolute + this.trick + this.resourcefulness + this.overbearing;
        int slytherinStudentScore = slytherinStudent.getWitchcraft() + slytherinStudent.getWitchcraft() + slytherinStudent.trick +
                slytherinStudent.resolute + slytherinStudent.ambition + slytherinStudent.resourcefulness +
                slytherinStudent.overbearing;
        if (slytherinStudentScore > thisStudentScore) {
                System.out.println(slytherinStudent.toString() + " лучший Когтевранец, чем " + this.toString());
            } else if (slytherinStudentScore == thisStudentScore) {
                System.out.println(slytherinStudent.toString() + " такой же Когтевранец, как и " + this.toString());
            } else {
                System.out.println(this.toString() + " лучший Когтевранрец, чем " + slytherinStudent.toString());
            }
    }


}
