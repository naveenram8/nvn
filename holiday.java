import java.io.*;
import java.util.*;
public class holiday{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String a[]=new String[]{"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
        String working_day=s.next();
        System.out.println("working day:"+working_day);
        if(working_day.equals(a[0])){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }
    }
}
