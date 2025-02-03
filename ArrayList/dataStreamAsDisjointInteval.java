
import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        Solution obj = new Solution();
        while (q-- > 0) {
            int input = sc.nextInt();
            if (input == 1) {
                int value = sc.nextInt();
                obj.addNum(value);
            } else {
                List<int[]> arr = obj.getIntervals();
                for (int i = 0; i < arr.size(); i++) {
                    for (int j = 0; j < arr.get(i).length; j++)
                        System.out.print(arr.get(i)[j] + " ");
                    System.out.println();
                }
            }
        }
        sc.close();
    }
}

class Solution {
    ArrayList<Integer>arr;
      public Solution() {
        arr = new ArrayList<>();
    }

    public void addNum(int val) {
        //write code here
        arr.add(val);
    }

    public List<int[]> getIntervals() {
        //write code here
        List<int[]>ans=new ArrayList<>();
        Collections.sort(arr);
        int n=arr.size();
        if(n==0)return new ArrayList<>();

        int sp=arr.get(0);
        int ep=arr.get(1);
        for(int i=1;i<n;i++){
            if(arr.get(i)-arr.get(i-1)==1){
                ep=arr.get(i);
            }
            else{
               ans.add(new int[]{sp,ep});
               sp=arr.get(i);
               ep=arr.get(i);
            }
        }
        ans.add(new int[]{sp,ep});
        return ans;
    }
};