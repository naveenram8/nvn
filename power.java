import java.io.*;
import java.util.*;
public class power { 
   public static void main(String args[]) {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      System.out.println("The number is:"+n);
      int p=s.nextInt();
      System.out.println("The power is:"+p);
      double b=Math.pow(n, p);
      System.out.println("power is:"+b);
   }
}
