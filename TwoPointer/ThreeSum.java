import java.io.*;
import java.util.*;



class Main {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }
        Solution solution = new Solution();
        List<List<Integer>> result = solution.threeSum(nums);
        //Sort all lists inside the list first
        for (int i = 0; i < result.size(); i++) {
            Collections.sort(result.get(i));
        }
        //Sort the list
        Collections.sort(result, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> l1, List<Integer> l2) {
                for (int i = 0; i < l1.size(); i++) {
                    if (l1.get(i) < l2.get(i)) return -1;
                    else if (l1.get(i) > l2.get(i)) return 1;
                }
                return 0;
            }
        });
        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < result.get(i).size(); j++) {
                System.out.print(result.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}

class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>>ans=new ArrayList<>();
      

        Arrays.sort(arr);
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(i>0&&arr[i]==arr[i-1]){continue;}
            int j=i+1,k=n-1;
            while(j<k){
                int sum=arr[i]+arr[j]+arr[k];
                if(sum<0){
                    j++;
                }
                else if(sum>0){
                    k--;
                }else{
                     List<Integer>a=new ArrayList<>();
                    a.add(arr[i]);
                    a.add(arr[j]);
                    a.add(arr[k]);
                    ans.add(a);
                    
                    j++;
                    k--;
                   
                    while(j<k&&arr[j]==arr[j-1]){j++;}
                    while(j<k&&arr[k]==arr[k+1]){k--;}
                }
            }
        }
        return ans;
    }
}