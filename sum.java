import java.io.*;
import java.util.*;
public class sum{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int sum=0;
int n[]=new int[a];
for(i=0;i<a;i++){
n[i]=s.nextInt();
sum+=n[i];
}
System.out.println(sum);
}
}
