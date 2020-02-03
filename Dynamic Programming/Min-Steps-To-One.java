public class Solution 
{
    public static int countStepsTo1(int n)
    {
        int arr[]=new int[n+1];
        for(int i=2;i<=n;i++)
        {
            int a=arr[i-1];
            if(i%3==0)
            {
                if(a>arr[i/3])
                {
                    a=arr[i/3];
                }
            }
            if(i%2==0)
            {
                if(a>arr[i/2])
                {
                    a=arr[i/2];
                }
            }
            arr[i]=1+a;
        }
        return arr[n];
    }
}