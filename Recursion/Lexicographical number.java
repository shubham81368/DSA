class Solution {
    //T.C->o(n)becuase we travere to every  digit
    public List<Integer> lexicalOrder(int n) {
        List<Integer>ans=new ArrayList<>();
        for(int startNum=1;startNum<=9;startNum++){
            //loop always  run to till 9 beacuse that all number consider by using append
            solve(startNum,n,ans);
        }
        return ans;
    }
    public void solve(int curr,int n,List<Integer>ans){
        if(curr>n)return ;
        ans.add(curr);
        for(int append=0;append<=9;append++){//lexicographically
            int currNum=curr*10+append;
            if(currNum>n)return;
            solve(currNum,n,ans);//dfs
        }
    }
}