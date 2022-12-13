import java.io.*;
import java.util.*;
interface PerformOperation {
 boolean check(int a);
}
class MyMath {
 public static boolean checker(PerformOperation p, int num) {
  return p.check(num);
 }

    // My code
    PerformOperation isOdd(){
        return (n -> n % 2 != 0);
    }
    
    PerformOperation isPrime(){
        return new PerformOperation(){
        
            @Override
            public boolean check(int a) {
            if (a <= 1) return false;
            for (int i = 2; i <= Math.sqrt(a); i++)
                if (a % i == 0)
                    return false;
            return true;
            }
        };
    }
    
   PerformOperation isPalindrome(){
       return new PerformOperation(){
       
           @Override
           public boolean check(int a) {
               int tmp = a;
               int aReversed = 0, reminder = 0;
               while (tmp > 0){
                   reminder = tmp%10;
                   aReversed = (aReversed*10) + reminder;
                   tmp /= 10;
               }
               return aReversed == a;
           }
       };
   }
   // End of my code

}

public class P62_JavaLambdaExpressions {

 public static void main(String[] args) throws IOException {
  MyMath ob = new MyMath();
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int T = Integer.parseInt(br.readLine());
  PerformOperation op;
  boolean ret = false;
  String ans = null;
  while (T--> 0) {
   String s = br.readLine().trim();
   StringTokenizer st = new StringTokenizer(s);
   int ch = Integer.parseInt(st.nextToken());
   int num = Integer.parseInt(st.nextToken());
   if (ch == 1) {
    op = ob.isOdd();
    ret = ob.checker(op, num);
    ans = (ret) ? "ODD" : "EVEN";
   } else if (ch == 2) {
    op = ob.isPrime();
    ret = ob.checker(op, num);
    ans = (ret) ? "PRIME" : "COMPOSITE";
   } else if (ch == 3) {
    op = ob.isPalindrome();
    ret = ob.checker(op, num);
    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

   }
   System.out.println(ans);
  }
 }
}
