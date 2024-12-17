  public static int aggressiveCows(int[] stalls, int k) {
        // code here
        
        if(k>stalls.length)return -1;
        Arrays.sort(stalls);
        
        int s=0,e=stalls[stalls.length-1]-stalls[0];
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            //if possible then inc the distance
            if(isPossible(stalls,mid,k)){
                ans=mid;
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return ans;
    }
    
    
    static boolean isPossible(int[] stalls,int minDis,int cows){
        int cowsCount=1;
        int lastCowDistance=stalls[0];
        for(int i=1;i<stalls.length;i++){
            //if min distance is maintained
            //then inc the count
            if(minDis<=stalls[i]-lastCowDistance){
                cowsCount++;
                lastCowDistance=stalls[i];
            }
            if(cowsCount>=cows)return true;
        }
        return false;
    }