package EducationExamSystem;

public class PracticalExam implements ExamEvaluator {
    private int viva, submission, execution;
    private double percentage;

    public PracticalExam(int viva, int submission, int execution) {
        this.viva = viva;
        this.submission = submission;
        this.execution = execution;
        this.percentage = ((viva + submission + execution) / 100.0) * 100;
    }

    public void evaluateMarks() {
        System.out.println("\n Practical Exam - Marks:");
        System.out.println("Viva: " + viva + ", Submissions: " + submission + ", Execution: " + execution);
        System.out.printf("Percentage: %.2f%%\n", percentage);

        if (viva < 20 || submission < 10 || execution < 10) {
            System.out.println("Result: Fail (Minimum: Viva=20, Sub=10, Exec=10)");
        } else {
            System.out.println("Result: Pass");
        }
    }

    public String calculateGrade() {
        if (viva < 20 || submission < 10 || execution < 10) return "Needs Improvement";
        if (percentage >= 90) return "Excellent";
        else if (percentage >= 75) return "Very Good";
        else if (percentage >= 50) return "Satisfactory";
        else return "Needs Improvement";
    }
}
