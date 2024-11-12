import java.util.*;

class Solution {
    static void missingNumbers(int n, int arr[], int m, int brr[]) {
        //Write your code here
        HashMap<Integer,Integer>map1=new HashMap<>();
        HashMap<Integer,Integer>map2=new HashMap<>();
        for(int num:arr){
            map1.put(num,map1.getOrDefault(num,0)+1);
        }
        for(int num:brr){
            map2.put(num,map2.getOrDefault(num,0)+1);
        }


        ArrayList<Integer>ans=new ArrayList<>();
        for(int num:map2.keySet()){
            if(map1.containsKey(num)==false){
                ans.add(num);
            }
            else if(map1.get(num)!=map2.get(num)){
                ans.add(num);
            }
        }
        if(ans.size()==0){System.out.print(-1);}
        Collections.sort(ans);
        for(int num:ans){
            System.out.print(num+" ");
        }
     
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }

        int m = sc.nextInt();
        int brr[] = new int[m];
        for(int i=0; i<m; i++){
            brr[i]= sc.nextInt();
        }

        Solution Obj = new Solution();
        Obj.missingNumbers(n,arr,m,brr);
    }
}