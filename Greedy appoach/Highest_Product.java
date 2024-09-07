import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static int maxp3(int[] arr) {
    //    // if size is less than 
    // // 3, no triplet exists
    // int n=arr.length;
    // if (n < 3)
    //     return -1;
 
    // // will contain max product
    // int max_product = Integer.MIN_VALUE;
 
    // for (int i = 0; i < n - 2; i++)
    //     for (int j = i + 1; j < n - 1; j++)
    //         for (int k = j + 1; k < n; k++)
    //             max_product = Math.max(max_product,
    //                       arr[i] * arr[j] * arr[k]);
 
    // return max_product;

      // if size is less than 3, no triplet exists
      int n=arr.length;
        if (n < 3) {
            return -1;
        }

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Return the maximum of product of last three
        // elements and product of first two elements
        // and last element
        return Math.max(arr[0] * arr[1] * arr[n - 1],
                arr[n - 1] * arr[n - 2] * arr[n - 3]);
    }

  
  public static void main (String[] args)
    {
		Scanner sc = new Scanner(System.in);
	    	int n = sc.nextInt();
            int[] A = new int[n];
            for(int i=0;i<n;i++)
            {
                A[i] = sc.nextInt();
            }
	    	System.out.println(maxp3(A));
		
	}
}