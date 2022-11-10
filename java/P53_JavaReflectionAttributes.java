import java.lang.reflect.*;
import java.util.*;

public class P53_JavaReflectionAttributes {
    
    public static void main(String[] args){
        // This solution passed on Java7, but not Java8. Check "Discussions" tab on HackerRank
        Class student = new Student().getClass();
        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for(Method m: methods){
            methodList.add(m.getName());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }

}
