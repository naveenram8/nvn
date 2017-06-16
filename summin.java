import java.util.*;
public class summin{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println("ENTER THE SIZE OF ARRAY'S:"+n);
		int[] a=new int[n];
		int[] b=new int[n];
		int[] c=new int[n];
		System.out.println("ENTER FIRST ARRAY:");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			System.out.print(a[i]+" ");
		}System.out.println();
		System.out.println("ENTER SECOND ARRAY:");
		for(int i=0;i<n;i++)
		{
			b[i]=s.nextInt();
			System.out.print(b[i]+" ");
		}System.out.println();
		for(int i=0;i<n;i++)
		{
			c[i]=a[i]+b[i];
		}
		Arrays.sort(c);
		int min=c[0];
		for(int i=0;i<n;i++)
		{
			if((a[i]+b[i])==min)
			{
				System.out.println(a[i]+"+"+b[i]+"="+min);
				break;
			}
		}
	}

}
