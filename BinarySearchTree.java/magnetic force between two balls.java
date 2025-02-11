import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        
        int position[]=new int[n];
        for(int i=0;i<n;i++)
        position[i]=sc.nextInt();

        Solution obj=new Solution();
        int ans=obj.magneticForce(position,n,m);
        System.out.println(ans);
    }
}


class Solution {
    int magneticForce(int position[],int n,int m) {
        // code here
        
        Arrays.sort(position);
        int s=1;
        int e=position[n-1]-position[0];

        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(isPossible(position,n,mid,m)){
                ans=mid;
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return ans;

    }
    boolean isPossible(int[] position,int n,int mid,int m){
        int prev=position[0];
        int ballcnt=1;
        for(int i=1;i<n;i++){
            int currpos=position[i];
            if(currpos-prev>=mid){
                ballcnt++;
                prev=currpos;
            }
            if(ballcnt>=m)return true;
        }
        return false;
    }
};