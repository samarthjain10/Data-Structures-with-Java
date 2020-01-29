public class Solution {

	public static boolean checkMaxHeap(int arr[]) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		 */
        for(int i=0;i<arr.length;i++)
        {
            int p=i;
            int l=2*i+1;
            int r=2*i+2;
            if(l<arr.length&&arr[p]<arr[l])
                return false;
            if(r<arr.length&&arr[p]<arr[r])
                return false;
        }
        return true;
	}
}
