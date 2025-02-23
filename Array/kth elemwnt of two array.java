import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr1 = new int[n];
		for(int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}
		int[] arr2 = new int[m];
		for(int i = 0; i < m; i++) {
			arr2[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		Solution s = new Solution();
		System.out.println(s.kthElementOfTwoSortedLists(arr1, arr2, k));
    }
}

class Solution {

    static int kthElementOfTwoSortedLists(int[] arr1, int[] arr2, int k) {
		int n=arr1.length;
		int m=arr2.length;
	    int l=1;
		int i=0;
		int j=0;
		while(i<n && j<m){
			if(arr1[i]<arr2[j]){
				
				if(k==l)return arr1[i];
				l++;
				i++;
				
			}
			else{
				
				if(l==k)return arr2[j];
				l++;
				j++;
			}
		}

		while(i<n){
			if(k==l)return arr1[i];
			l++;
			i++;
		}
		while(j<m){
			if(k==l)return arr2[j];
			l++;
			j++;
		}
		return -1;
	}
}