import java.util.ArrayList;

public class Department {
    private String name;

    // one-to-many association & aggregation
    private ArrayList<Employee> employees = new ArrayList<Employee>();

    public Department() {

    }
}
