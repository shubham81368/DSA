class Solution {
    public String pushDominoes(String dominoes) {
        int n=dominoes.length();
        int[] leftClosestR=new int[n];
        int[] rightClosestL=new int[n];
        Arrays.fill(leftClosestR,-1);
        Arrays.fill(rightClosestL,-1);
        for(int i=0;i<n;i++){
            char c=dominoes.charAt(i);
            if(c=='R')leftClosestR[i]=i;
            else if(c=='.'){
                if(i>0 && leftClosestR[i-1]!=-1)leftClosestR[i]=leftClosestR[i-1];
                else leftClosestR[i]=-1;
            }
            else{
                leftClosestR[i]=-1;
            }
        }

        //ab right closet of left ko find karenge
        for(int i=n-1;i>=0;i--){
            char c=dominoes.charAt(i);
            if(c=='R')rightClosestL[i]=-1;
            else if(c=='.'){
                if((i+1)<n && rightClosestL[i+1]!=-1){
                    rightClosestL[i]=rightClosestL[i+1];
                }
                else{
                    rightClosestL[i]=-1;
                }
            }
            else{
                rightClosestL[i]=i;
            }
        }

        String s="";

        for(int i=0;i<n;i++){
            if(leftClosestR[i]==rightClosestL[i]){
                s+='.';
            }
            else if(leftClosestR[i]==-1){
                s+='L';
            }
            else if(rightClosestL[i]==-1){
              s+='R';
            }
            else if(Math.abs(i-leftClosestR[i])<Math.abs(i-rightClosestL[i])){
                s+='R';
            }
            else if(Math.abs(i-leftClosestR[i])>Math.abs(i-rightClosestL[i])){
                s+='L';
            }
            else{
                s+='.';
            }
        }
          return s;
    }
}