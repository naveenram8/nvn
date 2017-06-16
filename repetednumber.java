import java.util.*;
public class repetednumber{
	public static void main(String ar[]){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println("ENTER THE SIZE OF ARRAY:"+n);
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
			}	
		Arrays.sort(a);
		for(int i=0;i<n-1;i++){
			if(a[i]==a[i+1]){
				System.out.println("THE REPEATING ELEMENTS IN ARRAY IS : "+a[i]);
	}
		}
	}
}
