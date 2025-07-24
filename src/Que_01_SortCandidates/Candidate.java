package Que_01;

public class Candidate {
    private String name;
    private int age;

    public Candidate(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // To string for displaying
    @Override
    public String toString() {
        return name + " - " + age;
    }
}

