import java.util.Comparator;

public class School {
    private int num_of_students;
    private String name;
    public School(String name, int num_of_students) {
        this.name = name;
        this.num_of_students = num_of_students;
    }
    public int getNumOfStudents() {
        return this.num_of_students;
    }
    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
       School sch1 = new School("sch1", 20);
       School sch2 = new School("sch2", 20);

       Comparator<School> retval = Comparator.comparingInt(School::getNumOfStudents);

        switch(retval.compare(sch1, sch2)) {
            case -1: {
                System.out.println("The " + sch2.getName() + " is bigger!");
                break;
            }
            case 1: {
                System.out.println("The " + sch1.getName() + " is bigger!");
                break;
            }
            default:
                System.out.println("The two schools are of the same size!");
        }
    }


}