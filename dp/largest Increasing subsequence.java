import java.io.*;
import java.util.*; 

class Main{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; ++i){
            array[i] = sc.nextInt();
        }
        Solution ob = new Solution();
        System.out.println(ob.longestIncreasingSubsequence(n,array));
    } 
} 

class Solution 
{
    static int longestIncreasingSubsequence(int size, int a[])
    {
        // code here
        List<Integer>sorted=new ArrayList<>();//hamm bas list me increaing element add kar rhe hai agar decreasing hai to override
        for(int i=0;i<size;i++){
            int index=binarySearch(sorted,a[i]);

            if(index==sorted.size()){//agar pichle se big hai to aage aayega
                sorted.add(a[i]);
            }
            else{
                sorted.set(index,a[i]);//agr pichle se chota ya equal hai to override
            }
        }
        return sorted.size();
    }

    public static int binarySearch(List<Integer>sorted,int target){
        int l=0;
        int r=sorted.size();
        int result=sorted.size();
        while(l<r){
            int mid=l+(r-l)/2;
            if(sorted.get(mid)<target){
                 l=mid+1;
            }
            else{
                result=mid;
                r=mid;
            }
        }
        return result;
    }
} 