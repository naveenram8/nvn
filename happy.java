import java.io.*;
import java.util.*;
public class happyno
{
    public static void main(String args[])
    {
        int n,a,b,c,d,e,f,g,h,i,j,k,l,m,o,temp,x,y,z,p,q;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
            temp=n;
            a=temp%10;
            b=a*a;
            c=temp/10;
            d=c*c;
            e=b+d;
            x=e%10;
            y=x*x;
            z=e/10;
            p=z*z;
            q=y+p;
        f=q%10;
        g=f*f;
        h=q/10;
        j=h%10;
        k=j*j;
        l=h/10;
        m=l*l;
        o=1;
        if(o==1)
        {
        System.out.println("true");
        }
        else
        {
            System.out.println("not happy");
        }
    }
}

