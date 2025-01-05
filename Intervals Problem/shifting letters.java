class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n=s.length();
        int arr[]=new int[n];
        for(int i=0;i<shifts.length;i++){
            int start=shifts[i][0];
            int end=shifts[i][1];
            int dir=shifts[i][2];
            int x=1;
                if(dir==0){
                    x=-1; 
                }
                if(dir==1){
                    x=1;
                }
                arr[start]+=x;
                if(end+1<n){
                    //kyoki jab ham cummlative sam lenge to aage wale range add 1 na ho isliye aage walo me -1 kiya hai
                    arr[end+1]-=x;
                }
            }
        
        //find the cumulative sum
        for(int i=1;i<n;i++){
            arr[i]+=arr[i-1];
        }
        String str="";
        for(int i=0;i<n;i++){
            int shift=arr[i]%26;
            if(shift<0){
                shift+=26;
            }
            char ch=(char)((s.charAt(i)-'a'+shift)%26+'a');
           
            str+=ch;
        }
        return str;
    }
}