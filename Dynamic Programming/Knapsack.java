public class Solution {

    public static int knapsack(int[] weight,int value[],int maxWeight,int n)
    {
        if(maxWeight==0 || n==0)
            return 0;
        if(weight[n-1]>maxWeight)
            return knapsack(weight,value,maxWeight,n-1);
        else
            return Math.max(value[n-1]+knapsack(weight,value,maxWeight-weight[n-1],n-1),knapsack(weight,value,maxWeight,n-1));
    }	
}