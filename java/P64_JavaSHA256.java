import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.security.*;
import javax.xml.bind.DatatypeConverter;

public class P64_JavaSHA256 {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner s = new Scanner(System.in);
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(s.next().getBytes()); 
        System.out.println((DatatypeConverter.printHexBinary(md.digest()).toLowerCase()));
        s.close();
    }
}
