import java.util.*;

class Solution {

    public int solve(int nums[],int n) {
        // Your code here
        
       int maxlen=0;
        for(int i=0;i<n;i++){
            for(int j=n-1;j>i;j--){
            if(nums[j]>=nums[i]&&maxlen<(j-i)){
                maxlen=j-i;
              }
            }
            
        }
  return maxlen;
    }
}

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++)
        nums[i]=sc.nextInt();

        Solution obj=new Solution();
        System.out.println(obj.solve(nums,n));
        sc.close();
    }
}