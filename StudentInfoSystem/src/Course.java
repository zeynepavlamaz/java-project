

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int pScore; // participation score
    int eScore; // exam score

    double avgScore; // average score


    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.pScore = 0;
        this.eScore = 0;
        this.avgScore = 0;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.department)) {
            this.courseTeacher = t;
            System.out.println("Operation successful");
        } else {
            System.out.println(t.name + " instructor cannot teach this course.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println("The instructor for the " + this.name + " course is: " + courseTeacher.name);
        } else {
            System.out.println("No instructor has been assigned to the " + this.name + " course.");
        }
    }
}

