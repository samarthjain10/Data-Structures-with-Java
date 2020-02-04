public class Solution {

    public static int minCostPath(int input[][]) {
        /* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
        return minCostPath(input,0,0);
    }
    public static int minCostPath(int input[][],int i,int j) {
        if(i>=input.length||j>=input[0].length)
            return Integer.MAX_VALUE;
        if(i==input.length-1&&j==input[0].length-1)
            return input[i][j];
        return Math.min(minCostPath(input,i+1,j),Math.min(minCostPath(input,i+1,j+1),minCostPath(input,i,j+1)))+input[i][j];
    }
}