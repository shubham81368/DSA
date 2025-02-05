vclass Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        // int cnt=0;
        //   int[] f1=new int[26];
        //   int[] f2=new int[26];
        // for(int i=0;i<s1.length();i++){
        //     f1[s1.charAt(i)-'a']++;
        //     f2[s2.charAt(i)-'a']++;
        //     if(s1.charAt(i)!=s2.charAt(i))cnt++;
        // }

        // for(int i=0;i<26;i++){
        //     if(f1[i]!=f2[i])return false;
        // }

        // return ((cnt/2+cnt%2)<=1);

        int s=0;
        int j=0;
        int cnt=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){cnt++;
            if(cnt>2)return false;//bez 1 swap allowed
            else{
                if(cnt==1)s=i;
                else{
                    j=i;
                }
            }
            }
        }
        return s1.charAt(s)==s2.charAt(j) && s1.charAt(j)==s2.charAt(s);
    }
}