import java.util.*;
class seed_number
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
			for(int i=1;i<=n;i++)
			{
				int sum=1;
				String st=String.valueOf(i);
				for(String s:st.split(""))
				{
					sum=sum*Integer.valueOf(s);
				}
				sum=sum*i;
				if(sum==n)
				{
					System.out.println(i);
					break;
				}
			}
	}
}
				
