import java.io.*;
import java.util.*;
public class diffarray
{
    public static void main(String args[])
    {
        int n=args.length;
        int a[]=new int[n];
        int b[]=new int[n-1];
        
        int i;
        
            for(i=0;i<n;i++)
            {
                a[i]=Integer.parseInt(args[i]);
              
            }
          
            for(i=0;i<n-1;i++)
            {
                b[i]=a[i]-a[i+1];
               
                if(b[i]<0)
                {   b[i] = Math.abs(b[i]);
                   
                }
                
                
            }
            
            Arrays.sort(b);
            
            System.out.println(b[b.length-1]);
        
    }
}







