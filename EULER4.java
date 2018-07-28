import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class euler4
{
    public static void main(String[]args)
    {
        euler4 o1=new euler4();
        int hp=0;
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int[]arr=new int[t];
        for(int i=0;i<t;++i)
        arr[i]=sc.nextInt();
        for(int i=0;i<t;++i)
        {
            for(int j=999;j>0;--j)
            {
                for(int k=999;k>0;--k)
                {
                    int p=j*k;
                    if(p<arr[i] && p>=100000)
                    {
                        if(o1.palindrome(p) && p>hp)
                            hp=p;
                    }
                }

            }
            if(hp!=0)
                    System.out.println(hp);
        }
            }
    boolean palindrome(int p)
    {
        int tmp=p;
        int sum=0;
        while(tmp!=0)
        {
            sum*=10;
            sum+=tmp%10;
            tmp/=10;
        }
        if(sum==p)
            return true;
        else
            return false;
    }
}
