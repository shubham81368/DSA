class Solution {
    int maxSum;
    int maxLen;
    public int sumOfLongRootToLeafPath(Node root) {
        // code here
        maxSum=0;
        maxLen=0;
        
        helper(root,0,0);
        return maxSum;
    }
    
    public void helper(Node root,int currSum,int currlen){
        if(root==null)return;
           currSum+=root.data;
            currlen+=1;
        if(root.left==null && root.right==null){
            if(currlen>maxLen){
                maxLen=currlen;
                maxSum=currSum;
            }
            else if(currlen==maxLen && currSum>maxSum){
                maxSum=currSum;
            }
        }
        
     
        
        helper(root.left,currSum,currlen);
        helper(root.right,currSum,currlen);
    }
}