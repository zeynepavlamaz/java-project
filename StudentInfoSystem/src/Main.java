

public class Main {
    public static void main(String[] args) {

        Course math = new Course("Mathematics", "MAT101", "MAT");
        Course physics = new Course("Physics", "FZK101", "FZK");
        Course chemistry = new Course("Chemistry", "KMY101", "KMY");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        math.addTeacher(t1);
        physics.addTeacher(t2);
        chemistry.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", math, physics, chemistry);
        s1.setPScore(60, 70, 80);
        s1.setEScore(40,50,60);
        s1.addBulkExamScore();
        s1.checkIfPassed();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", math, physics, chemistry);
        s2.setPScore(60, 70, 80);
        s2.setEScore(40,50,60);
        s2.addBulkExamScore();
        s2.checkIfPassed();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", math, physics, chemistry);
        s3.setPScore(60, 70, 80);
        s3.setEScore(40,50,60);
        s3.addBulkExamScore();
        s3.checkIfPassed();
    }
}
