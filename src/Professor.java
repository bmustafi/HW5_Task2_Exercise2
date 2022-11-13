import java.util.ArrayList;

public class Professor extends Employee { // subclass of Employee

    private ArrayList<Course> courses = new ArrayList<Course>();

    // many-to-many association
    private ArrayList<Exam> exams = new ArrayList<Exam>();

    public Professor(Course course) {
        this.courses.add(course);
    }

    public void publicCourse() {

    }

    public void assignTA() {

    }

    public void addCourse() {

    }
}
