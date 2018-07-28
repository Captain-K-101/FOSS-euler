import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class euler5
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int[]arr=new int[t];
        for(int i=0;i<t;++i)
        arr[i]=sc.nextInt();
        int c=0;
        for(int i=0;i<t;++i)
        {
            int tmp=arr[i];
            while(c!=arr[i])
            {
                for(int j=1;j<=arr[i];++j)
                {
                    if(tmp%j==0)
                    {
                       ++c;
                        continue;
                    }
                    else
                    {
                        tmp+=arr[i];
                        c=0;
                        break;
                    }
                                       }
            }
            System.out.println(tmp);
        }


    }
}
