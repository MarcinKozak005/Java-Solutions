public class P44_JavaPriorityQueue {
    class Student implements Comparable<Student>{
        int id;
        String name;
        double cgpa;
        Student(int id, String name, double cgpa){
            this.id = id;
            this.name = name;
            this.cgpa = cgpa;
        }
        
        int getID(){return id;}
        String getName(){return name;}
        double getCGPA(){return cgpa;}
        public String toString(){return name+" "+cgpa+" "+id;}
        
        public int compareTo(Student s2){
            int cgpaCompare = Double.compare(s2.cgpa, cgpa);
            if (cgpaCompare != 0) return cgpaCompare;
            int nameCompare = name.compareTo(s2.name);
            if (nameCompare != 0) return nameCompare;
            return Integer.compare(id, s2.id); 
        }
    }
    
    class Priorities{
        PriorityQueue<Student> queue = new PriorityQueue<Student>();
        List<Student> getStudents(List<String> events){
            for(String event: events){
                if(event.startsWith("ENTER")){
                    String[] tmp = event.split(" ");
                    queue.add(new Student(Integer.parseInt(tmp[3]),tmp[1],Double.parseDouble(tmp[2])));
                }
                else queue.poll();
            }
            return queue.stream().sorted().collect(Collectors.toList());
        }
    }
}
