
public class Student {
    String name, studentNumber;
    int gradeLevel;
    Course math;
    Course physics;
    Course chemistry;
    double average;
    boolean hasPassed;


    Student(String name, int gradeLevel, String studentNumber, Course math, Course physics, Course chemistry) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.studentNumber = studentNumber;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        calcAverage();
        this.hasPassed = false;
    }

    public void setPScore(int math, int physics, int chemistry){
        if (math >= 0 && math <= 100) {
            this.math.pScore  = math;

        }

        if (physics >= 0 && physics <= 100) {
            this.physics.pScore = physics;
        }

        if (chemistry >= 0 && chemistry <= 100) {
            this.chemistry.pScore = chemistry;
        }

    }

    public void setEScore(int math, int physics, int chemistry){
        if (math >= 0 && math <= 100) {
            this.math.eScore  = math;
        }

        if (physics >= 0 && physics <= 100) {
            this.physics.eScore = physics;
        }

        if (chemistry >= 0 && chemistry <= 100) {
            this.chemistry.eScore = chemistry;
        }

    }

    public void addBulkExamScore () {
        this.math.avgScore = (math.pScore * 0.20) + (math.eScore * 0.80);
        this.physics.avgScore = (physics.pScore * 0.20) + (physics.eScore * 0.80);
        this.chemistry.avgScore = (chemistry.pScore * 0.20) + (chemistry.eScore * 0.80);
    }

    public void checkIfPassed() {
        if (this.math.avgScore == 0 || this.physics.avgScore == 0 || this.chemistry.avgScore == 0) {
            System.out.println("Scores have not been entered correctly");
        } else {
            this.hasPassed = checkPassCriteria();
            printScore();
            System.out.println("Average : " + this.average);
            if (this.hasPassed) {
                System.out.println("Passed the class.");
            } else {
                System.out.println("Failed the class.");
            }
        }
    }

    public void calcAverage() {
        this.average = (this.physics.avgScore + this.chemistry.avgScore + this.math.avgScore) / 3;
    }

    public boolean checkPassCriteria() {
        calcAverage();
        return this.average > 55;
    }

    public void printScore(){
        System.out.println("=========================");
        System.out.println("Student : " + this.name);
        System.out.println("Math Score : " + this.math.avgScore);
        System.out.println("Physics Score : " + this.physics.avgScore);
        System.out.println("Chemistry Score : " + this.chemistry.avgScore);
    }
}
