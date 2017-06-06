import java.io.*;
import java.util.*;
public class digit{
public static void main(String args[]){
int n,a=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
if(n<0){
n=n*-1;
}else if(n==0){
n=1;
}while(n>0){
n=n/10;
a++;
}
System.out.println("no of digit is "+a);
}
}
