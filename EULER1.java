import java.util.*;

public class euler1
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int[]arr=new int[t];
        for(int i=0;i<t;++i)
        arr[i]=sc.nextInt();
        int sum=0;
        for(int i=0;i<t;++i)
        {
             for(int j=0;j<arr[i];++j)
             {
                 if(j%3==0 || j%5==0)
                     sum+=j;
             }
            System.out.println(sum);
            sum=0;
        }

    }

}
