package EducationExamSystem;

public class OnlineQuiz implements ExamEvaluator {
    private int marks;

    public OnlineQuiz(int marks) {
        this.marks = marks;
    }

    public void evaluateMarks() {
        System.out.println("\n Online Quiz Marks: " + marks);
        System.out.println("Result: " + (marks >= 30 ? "Pass" : "Fail"));
    }

    public String calculateGrade() {
        if (marks >= 90) return "Top Scorer";
        else if (marks >= 60) return "Good";
        else if (marks >= 30) return "Average";
        else return "Low";
    }
}
