class Solution {
    public boolean canAliceWin(int n) {
       int stoneToRemove=10;
        while(n>0){
            //alice turn
            if(n>=stoneToRemove){
                n-=stoneToRemove;
            }
            else{
                return false;
            }
            stoneToRemove--;
            //bob turn
            if(n>=stoneToRemove){
                n-=stoneToRemove;
            }
            else{
                return true;
            }
            stoneToRemove--;
            
        }
        
        return false;
    
    }
}