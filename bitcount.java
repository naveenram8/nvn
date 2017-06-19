import java.util.Scanner;
import java.lang.Integer.*;
class bitcount {
    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i,j;
        int num[]=new int[n];
        int bit[]=new int[n];
        for(i=0;i<n;i++){
            num[i]=s.nextInt();
            bit[i]=Integer.bitCount(num[i]);
        }
        
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(num[i]<num[j]){
                    int temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                    temp=bit[i];
                    bit[i]=bit[j];
                    bit[j]=temp;
                }
            }
        }    
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(bit[i]<bit[j]){
                    int temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                    temp=bit[i];
                    bit[i]=bit[j];
                    bit[j]=temp;
                }
            }
        }    
        for(i=0;i<n;i++){
            System.out.println(num[i]+" ");
        }                
        
    }
}
