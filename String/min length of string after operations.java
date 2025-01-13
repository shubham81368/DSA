class Solution {
    public int minimumLength(String s) {
        int n=s.length();
        int[] arr=new int[26];
        for(int i=0;i<n;i++){
            arr[s.charAt(i)-'a']++;
        }
          int cnt=0;
        for(int i=0;i<26;i++){
            if(arr[i]==0)continue;
            if(arr[i]%2==0){
                cnt+=2;
            }
            else{
                cnt+=1;
            }
        }

        return cnt;
    }
}