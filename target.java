import java.io.*;
import java.util.*;
public class target{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int target,i,j;
        int n=s.nextInt();
        
        System.out.println("Enter the array size:"+n);
        int a[]=new int[n];
        for(i=0;i<n;i++){
            a[i]=s.nextInt();
            System.out.print(a[i]);
        }
        System.out.println();
        s.nextLine();
         target=s.nextInt();
        System.out.println("Enter the target value:"+target);
        System.out.println();
        for(i=0;i<n;i++){
            for(j=1;j<=n;j++){
                if((a[i]+a[j])==target){
                    System.out.println("The numbers are:"+a[i]+" "+a[j]);
                    break;
                }
                    
                }
            
        }
       
    }
}
