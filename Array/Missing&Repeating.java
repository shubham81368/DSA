class Solve {
    int[] findTwoElement(int arr[]) {
        // code here
        int[] mis=new int[2];
        
        int n=arr.length;
        
        int hasharr[]=new int[n+1];
        
       
    
        for(int i=0;i<arr.length;i++){
             hasharr[arr[i]]++;
        }
        int repeat=0;
        int missing=0;
        for(int i=1;i<=n;i++){
            if(hasharr[i]==2)repeat=i;
            else if(hasharr[i]==0)missing=i;
            if(repeat!=0&&missing!=0){
                break;
            }
        }

        
        mis[0]=repeat;
        mis[1]=missing;
        return mis;
        
    }
}