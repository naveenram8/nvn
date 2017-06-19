import java.io.*;
import java.util.*;
import java.util.Arrays;
public class FirstRepeated{
    public static void main(String ar[]){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b[] = new int[a];
        for(int i=0;i<a;i++){
            b[i] = s.nextInt();
        }
        Arrays.sort(b);
        for(int i=1;i<b.length;i++){
            if(b[i-1] == b[i]){
                System.out.println("The First Repeated Number is: "+b[i]);
            } 
        }
    }
}
