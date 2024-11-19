class Solution {
    void nextPermutation(int[] arr) {
        // code here
        int n=arr.length;
        
        int index=-1;
        //jis position pe swap karna hai pahele vo find karenge
        for(int i=n-1;i>=1;i--){
            if(arr[i]>arr[i-1]){
                index=i-1;
                break;
            }
        }
        
        if(index==-1){
            reverse(arr,0,n);
            return;
        }
        //yahan swap kardiya number ko
        
        for(int i=n-1;i>index;i--){
            if(arr[i]>arr[index]){
                swap(arr,i,index);
                break;
            }
        }
        
        //min number bnana hai index ke aage ke number ko
        reverse(arr,index+1,n);
        
        
        
        
    }
    
    
    void reverse(int[] arr,int s,int e){
        for(int i=s;i<(s+e)/2;i++){
            int temp=arr[i];
            arr[i]=arr[e-1-(i-s)];
            arr[e-1-(i-s)]=temp;
        }
    }
    
    void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}