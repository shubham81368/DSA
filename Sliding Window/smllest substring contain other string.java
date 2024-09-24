class Solution
{
    //Function to find the smallest window in the string s consisting
    //of all the characters of string p.
    public static String smallestWindow(String s, String p)
    {
        // Your code here
        //create an freq array
        int mp[]=new int[256];
        Arrays.fill(mp,0);
        int count=0;//no. of distinct character of string p
        for(int i=0;i<p.length();i++){
          if(mp[p.charAt(i)]==0)count++;
            mp[p.charAt(i)]++;

        }
        
        //now take varible for length res
        int i=0,j=0,start=0,res=Integer.MAX_VALUE;
        while(j<s.length()){
            mp[s.charAt(j)]--;
            if(mp[s.charAt(j)]==0)count--;
            
                while(count==0){
                    if(j-i+1<res){
                        start=i;
                        res=j-i+1;
                    }
                    mp[s.charAt(i)]++;
                    if(mp[s.charAt(i)]==1)count++;
                    i++;
                }
            
            j++;
        }
        if(res!=Integer.MAX_VALUE)return s.substring(start,start+res);
        return "-1";
        
    }
}