import java.io.*;
import java.util.*;

class Solution {
    public boolean arrayPairs(int[] arr, int k) {
		// write code here
        HashMap<Integer,Integer>mp=new HashMap();
        for(int i=0;i<arr.length;i++){
            mp.put(arr[i]%k,mp.getOrDefault(arr[i]%k,0)+1);
        }
        //iterate over keys
        for(Integer key:mp.keySet()){
            if(key==0){
                if(mp.get(key)%2!=0)return false;
            }
            else{
                if(!mp.containsKey(k-key) || mp.get(key)!=mp.get(k-key))return false;
                //here count compare of elemnts
            }
        }
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k;
        n = sc.nextInt();
		k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
        if(Obj.arrayPairs(arr,k)){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
    }
}