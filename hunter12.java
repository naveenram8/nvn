import java.io.*;
import java.util.*;
public class hunter12{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[50];
        int n=a.length;
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int k=sc.nextInt();
        System.out.println(a[n-k]);
        
    }
}
