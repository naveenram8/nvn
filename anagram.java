import java.io.*;
import java.util.*;
public class anagram{
    public static void main(String ar[]){
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        String s2=s.nextLine();
        char c[]=s1.toCharArray();
        char d[]=s2.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        String s3=new String(c);
        String s4=new String(d);
        String s5=s4.replaceAll("\\W","");
        if(s3.equals(s5)){
           System.out.println("True");
        }else{
          System.out.println("False");
        }
    }
}

