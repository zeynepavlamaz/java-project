import java.time.Year;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // Method to calculate tax based on salary
    double tax() {
        if (salary < 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    // Method to calculate bonus based on overtime work
    double bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    // Method to calculate a salary raise based on years worked
    public double raiseSalary() {
        int currentYear = Year.now().getValue();
        int yearsWorked = currentYear - hireYear;

        double raiseAmount = 0;

        if (yearsWorked < 10) {
            raiseAmount = salary * 0.05;
        } else if (yearsWorked < 20) {
            raiseAmount = salary * 0.1;
        } else {
            raiseAmount = salary * 0.15;
        }

        salary += raiseAmount;

        return raiseAmount;
    }



    // Override toString method to display employee information
    @Override
    public String toString() {
        double salaryRaise = raiseSalary(); // Calculate salary raise and update salary
        double totalSalary = salary + bonus() - tax();
        return "Name: " + name +
                "\nSalary: " + salary +
                "\nWork Hours: " + workHours +
                "\nHire Year: " + hireYear +
                "\nTax: " + tax() +
                "\nBonus: " + bonus() +
                "\nSalary Raise: " + salaryRaise + // Use the calculated salary raise
                "\nTotal Salary with Tax and Bonus: " + totalSalary +
                "\nTotal Salary: " + (totalSalary + bonus());
    }


}