import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class euler2
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int[]arr=new int[t];
        for(int i=0;i<t;++i)
           arr[i]=sc.nextInt();
        for(int i=0;i<t;++i)
        {
            int sum=2;
            int a=1;
            int b=2;

            int c=0;
            boolean flag=false;
            while(c<arr[i])
            {
                if(c%2==0)
                    sum+=c;
                c=a+b;

                a=b;
                b=c;
                flag=true;
            }

            if(flag==true)
            System.out.println(sum);
        }


    }
}
