import java.io.*;
import java.util.*;
public class leapyear{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int yr=s.nextInt();
if((yr%4==0)&&(yr%100!=0)||(yr%400==0)){
System.out.println(yr+" is leap year");
}else{
System.out.println(yr+" is not a leap year");
}
}
}
