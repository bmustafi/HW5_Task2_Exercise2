public class Course {
    private int id;
    private String name;
    private int maxCapacity;
    private boolean isFull;

    // 0..* multiplicity
    private Professor[] professor = new Professor[2];

    public Course(int id, String name, int cap, Professor prof) {

    }


    public void addProf(Professor prof) {
        for(int i = 0; i < professor.length; i++) {
            if(professor[i] == null) {
                professor[i] = prof;
                break;
            }
        }
    }

    public void enroll(Student student) {

    }

    public void apply(TA ta) {

    }

    public void setMaxCap(int max) {

    }

    public Professor getProf() {
        return null;
    }

    public TA getTA() {
        return null;
    }

    public void setTA(TA ta) {

    }

    public void setName(String name) {

    }
}
