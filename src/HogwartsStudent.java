public abstract class HogwartsStudent {
    private final int witchcraft;
    private final int transgression;
    private final String firstName;
    private final String lastName;

    protected HogwartsStudent(String firstName, String lastName, int witchcraft, int transgression) {
        if (witchcraft >= 0 && witchcraft <= 100 && transgression >= 0 && transgression <= 100
        && !firstName.isEmpty() && !lastName.isEmpty()) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.witchcraft = witchcraft;
            this.transgression = transgression;
        } else throw new IllegalArgumentException("Введите корректные значения");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public int getTransgression() {
        return transgression;
    }

    @Override

    public String toString() {
        return firstName + " " + lastName;
    }

    public void printStudentInfo() {
        System.out.println("Качества студента " + firstName + " " + lastName +
                ": колдовство " + witchcraft + ", трансгрессия " + transgression);
    }

    public void compareStudentWith(Object student) {
        if (student instanceof  HufflepuffStudent) {
            if (((HogwartsStudent) student).getWitchcraft() >
            this.witchcraft) System.out.println(student.toString() + " обладает большей мощностью магии, чем " +
                    this.toString());
                else System.out.println(this.toString() + " обладает большей мощностью магии, чем " + student.toString());
            if (((HogwartsStudent) student).getTransgression() > this.transgression) System.out.println(student.toString() +
                     " обладает большей мощностью трансгрессии, чем " + this.toString());
                else System.out.println(this.toString() + " обладает большей мощностью трансгрессии, чем " +
                    student.toString());
        }
    }

}
