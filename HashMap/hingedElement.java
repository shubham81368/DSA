import java.io.*;
import java.util.*;

class Solution {
    public int findElement(int[] arr, int n) {
        // Write your code here
		int leftMax[]=new int[n];
		int rightMax[]=new int[n];
		
		leftMax[0]=Integer.MIN_VALUE;
		rightMax[n-1]=Integer.MAX_VALUE;

		for(int i=1;i<n;i++){//ye left max ko calculate kar rha hai current element ke picche
			leftMax[i]=Math.max(leftMax[i-1],arr[i-1]);
		}
   //ye rightmax ko calculate kar rha hai curr index ke liye
		for(int i=n-2;i>=0;i--){
			rightMax[i]=Math.min(rightMax[i+1],arr[i+1]);
		}
	//    for(int i=0;i<n;i++){
	// 	System.out.print(leftMax[i]+" ");
		
	//    }
	//    System.out.println();
	//     for(int i=0;i<n;i++){
	// 	System.out.print(rightMax[i]+" ");
		
	//    }
	//    System.out.println();

	if(arr[n-1]>leftMax[n-1])return n-1;

		for(int i=1;i<n;i++){
			if(arr[i]>leftMax[i] && arr[i]<rightMax[i]){
			    return i;
				
			}
		}
		return -1;
    }
}

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}

        Solution Obj = new Solution(); 
		System.out.println(Obj.findElement(nums, n));
	}
}