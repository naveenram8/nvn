import java.util.Scanner;

public class pangram {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
   		String s=in.nextLine();
   		char[] c=s.toLowerCase().toCharArray();
   		int count=0;
   		char[] cc="abcdefghijklmnopqrstuvwxyz".toCharArray();
   		for(int i=0;i<cc.length;i++)
   			{
   			for(int j=0;j<s.length();j++)
   			{
   				if(cc[i]==c[j])
   				{
   					count++;
   					break;
   				}
   			}
   			}
   		if(count==26)
   		{
   			System.out.println("PANAGRAM");
   		}
   		else
   		{
   			System.out.println("NOT A PANAGRAM");
   		}

	}

}
