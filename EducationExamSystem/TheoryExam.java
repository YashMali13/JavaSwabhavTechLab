package EducationExamSystem;

public class TheoryExam implements ExamEvaluator {
    private int phy, chem, math;
    private double percentage;

    public TheoryExam(int phy, int chem, int math) {
        this.phy = phy;
        this.chem = chem;
        this.math = math;
        this.percentage = (phy + chem + math) / 3.0;
    }

    public void evaluateMarks() {
        System.out.println("\n Theory Exam - Marks:");
        System.out.println("Physics: " + phy + ", Chemistry: " + chem + ", Math: " + math);
        System.out.printf("Percentage: %.2f%%\n", percentage);
        
        if (phy < 35 || chem < 35 || math < 35) {
            System.out.println("Result: Fail (Minimum 35 required in each subject)");
        } else {
            System.out.println("Result: Pass");
        }
    }

    public String calculateGrade() {
        if (phy < 35 || chem < 35 || math < 35) return "F";
        if (percentage >= 90) return "A+";
        else if (percentage >= 75) return "A";
        else if (percentage >= 60) return "B";
        else if (percentage >= 40) return "C";
        else return "F";
    }
}
