//TASK-3.1(JAVA PRIORITY QUEUE)
import java.util.PriorityQueue;
class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double cgpa;
    
    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    
    public int getID() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public double getCGPA() {
        return cgpa;
    }
    
    @Override
    public int compareTo(Student other) {
        if (Double.compare(other.cgpa, this.cgpa) != 0) {
            return Double.compare(other.cgpa, this.cgpa);
        } else if (!this.name.equals(other.name)) {
            return this.name.compareTo(other.name);
        } else {
            return Integer.compare(this.id, other.id);
        }
    }
}

public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
//TASK-3.2(JAVA ARRAY LIST)
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        ArrayList<ArrayList<Integer>> lines = new ArrayList<ArrayList<Integer>>();
        
        for (int i = 0; i < n; i++) {
            int d = scan.nextInt();
            ArrayList<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j < d; j++) {
                row.add(scan.nextInt());
            }
            lines.add(row);
        }
        
        int q = scan.nextInt();
        for (int i = 0; i < q; i++) {
            int x = scan.nextInt() - 1; // 1-based indexing to 0-based
            int y = scan.nextInt() - 1; 
            
            try {
                System.out.println(lines.get(x).get(y));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
        
        scan.close();
    }
}
