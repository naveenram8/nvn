import java.io.*;
import java.util.*;
public class reverse{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int rev=0,re;
        int n=s.nextInt();
        while(n>0){
            re=n%10;
            rev=rev*10+re;
            n=n/10;
        }
        System.out.println(rev);
    }
}
