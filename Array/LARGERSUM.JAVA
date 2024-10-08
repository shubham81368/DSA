class Solution {
    public static int pairsum(int[] arr) {
        // code here
        int num1=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(num1<arr[i])num1=arr[i];
        }
        
        int num2=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(num2<arr[i]&&arr[i]!=num1){
                num2=arr[i];
            }
        }
        return num1+num2;
    }
}
