import java.util.ArrayList;

public class Exam {
    private int maxValue;

    // 1..* multiplicity & composition
    private ArrayList<Question> questions = new ArrayList<Question>();

    // many-to-many association
    private ArrayList<Professor> profs = new ArrayList<Professor>();

    public Exam(Question question) {
        this.questions.add(question);
    }

    public boolean register(Student student) {
    return false;
    }

    public void addQuestion(int id, String task, int value) {

    }

    public Student getRegisteredStudents() {
        return null;
    }

    public void setMaxValue(int max) {

    }
}
