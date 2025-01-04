import java.util.Scanner;

import java.util.*;

class Solution {
    static boolean isPossible(int[] piles,int min,int h){
        int mintime=0;
        for(int pile:piles){
            mintime+=pile/min;
            if(pile%min!=0){
                mintime++;
            }
        }
        return mintime<=h;
    }
    public static int minEatingSpeed(int[] piles, int H) {
        // Your code here
        int s=1;//min banana can eat
        int max=Integer.MIN_VALUE;
        for(int num:piles){
            max=Math.max(max,num);
        }
        int e=max;//max banana can eat
        while(s<e){
            //per hr i can eat mid banana
            int mid=s+(e-s)/2;
            
            if(isPossible(piles,mid,H)){
                e=mid;//agar itna kha sakta hai tu usse nicche ke liye dhudenge
            }
            else{
                s=mid+1;
            }
        }
        return e;
    } 
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int h = scanner.nextInt();
        System.out.println(Solution.minEatingSpeed(array, h));
        scanner.close();
    }
}
