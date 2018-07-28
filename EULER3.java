import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class euler3
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int[]arr=new int[t];
        for(int i=0;i<t;++i)
        arr[i]=sc.nextInt();
        int hp=0;
        for(int i=0;i<t;++i)
        {

            hp=0;
            int n=arr[i];
            for(int j=2;j<=n;++j)
            {

                if(n%j==0)
                {
                    int c=0;
                     for(int k=2;k<=j/2;++k)
                     {
                         if(j%k==0)
                             ++c;
                    }
                    if(c==0)
                    {
                        if(j>hp)
                            hp=j;
                    }
                }
            }
            System.out.println(hp);
        }

    }
}
