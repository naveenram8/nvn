import java.io.*;
import java.util.*;
public class alphabet{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
char ch=s.next().charAt(0);
if((ch>='a')&&(ch<='z')){
System.out.println("Given charecter ia an alphabet");
}else{
System.out.println("Given character is not an alphabet");
}}}

