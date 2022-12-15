package de.bht.pr2.lab04;

public record Certificate(
        Student student
) {
    static Grade grade;

    public void addGrade(Grade grade)
    {
        this.grade = grade;
    }
    public Grade getGrade()
    {
        return this.grade;
    }
}
