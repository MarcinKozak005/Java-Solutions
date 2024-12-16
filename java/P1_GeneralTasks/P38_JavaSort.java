import java.util.Scanner;

public class P38_JavaSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        // My code
        studentList.sort((s1, s2) -> {
            int gdpa = Double.compare(s2.getCgpa(), s1.getCgpa());
            if (gdpa != 0) return gdpa;
            int name = s1.getFname().compareTo(s2.getFname());
            if (name != 0) return name;
            return Integer.compare(s1.getId(), s2.getId());
        });
        // end of my code
        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}
