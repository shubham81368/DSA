import java.util.*;

class Main{
	public static void main(String[] args){
		try (Scanner sc = new Scanner(System.in)) {
			int t=sc.nextInt();
			while(t>0){
				int n=sc.nextInt();
				int []A=new int[n];
				int m=sc.nextInt();
				int k=sc.nextInt();
				for(int i=0;i<n;i++){
					A[i]=sc.nextInt();
				}
				Solution ob =new Solution();
				int ans = ob.minDays(A,n,m,k);
				System.out.println(ans);
				t--;
			}
		}
	}

}
class Solution {
    public int minDays(int[] bloomDay,int n, int m, int k) {
		//Write code here
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
			min=Math.min(min,bloomDay[i]);
			max=Math.max(max,bloomDay[i]);
		}

		int s=min;
		int e=max;
		int ans=-1;
		while(s<=e){
			int mid=s+(e-s)/2;
			if(isPossible(bloomDay,mid,m,k)){
              ans=mid;
			  e=mid-1;
			}
			else{
				s=mid+1;
			}
		}

		 return ans;
	}

	boolean isPossible(int[] bloomDay,int minDay,int m,int k){
            int cnt=0;
			int total=0;
			for(int i=0;i<bloomDay.length;i++){
				if(bloomDay[i]<=minDay){
					cnt++;
				}
				else{
					cnt=0;
				}
				if(cnt==k){
					total++;
					cnt=0;
				}
				if(total>=m){
					return true;
				}
				
			}
			return false;
	}
}