import java.util.*;
public class Solution {
	public static ArrayList<Integer> longestConsecutiveIncreasingSequence
        (int[] arr) {
		//1. create an hashmap and add all the elements in it
        HashMap<Integer, Boolean> map=new HashMap<>();
        
        for(int i=0; i<arr.length; i++){
            if(!map.containsKey(arr[i])==true){
                map.put(arr[i], false);
            }
        }
        
        //2. identify leader elements
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i]-1)){
                map.put(arr[i], true);
            }else{
                //leader element
            }
        }
        
        //3. final step
        int streak_length=0;
        int leader=-1;
        for(int i=0; i<arr.length; i++){
             if(map.get(arr[i])==false){
                 int merilength=0;
                 int temp=arr[i];
                 while(map.containsKey(temp)){
                     merilength++;
                     temp++;
                 }
                 if(merilength>streak_length){
                     streak_length=merilength;
                     leader=arr[i];
                 }
             }else{
                 //do nothing
             }   
            
        }
        
        //4. arraylist
        ArrayList<Integer> mylist=new ArrayList<>();
        
        for(int lv=leader; lv<(streak_length+leader); lv++){
            mylist.add(lv);
        }
        
        return mylist;
        
        
	}
}