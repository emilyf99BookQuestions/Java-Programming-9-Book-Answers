public class ShowStudent {

    public static void main(String[] args) {
        Student Eric = new Student();
        Eric.IDNumber = 1;
        Eric.numberOfPointsEarned = 12;
        Eric.numberOfCreditHours = 3;

        Student.showStudent(Eric.IDNumber, Eric.numberOfPointsEarned, Eric.numberOfCreditHours);
    }
}
