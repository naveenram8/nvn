import java.util.Scanner;
public class pro67_alex {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=Integer.valueOf(s.next());
		int fr=Integer.valueOf(s.next());
		s.nextLine();
		String b=(s.nextLine());
		int[] f=new int[fr];
		for(int i=0;i<fr;i++){
			f[i]=Integer.valueOf(s.next());
		}		int count=0,j=1;
        for(String s1:b.split("")){
        	if(s1.equals("0")){
        	for(int i=0;i<fr;i++)	{
    			if(j==f[i])	{
    				count++;
    			}}}
        	j++;
        }
		if(count==0){
			System.out.print("NO");
		}	else{
			System.out.print("YES");
		}	}}
