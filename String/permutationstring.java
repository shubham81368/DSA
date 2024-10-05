class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        if(n>m)return false;//agar size he jada hai s1 ka to vo s2 me kuch element nhi hoga

        int map1[]=new int[26];
        //isse hame ne first string me aane wale letter ka count store kar liya
        for(int i=0;i<n;i++){
            map1[s1.charAt(i)-'a']++;
        }

        //second string kar length ka starting windiow kaha tak jyeaga ye s1 pe depend hai
        for(int i=0;i<=m-n;i++){//agar hamara s1 or s2 ka lenght same hai ya s2 para hai to vo same letter consists kar hai hai ya nhi window ke andar ye check karne se pahele har ek window ka map store karke check karenge
        int map2[]=new int[26];
        for(int j=0;j<n;j++){
        map2[s2.charAt(i+j)-'a']++;

        }
         //check mp1 letter and map2 letter
         if(isMatched(map1,map2)){
            return true;
         }
        }
        return false;
    }


    public boolean isMatched(int map1[],int map2[]){
        for(int i=0;i<26;i++){
        if(map1[i]!=map2[i]){
            return false;
        }
        }
        return true;
    }
}