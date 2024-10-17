import java.util.*;

public class Main {
     //time complexity -o(n)
    public static int characterReplacement(int n, int k,String s){
        //write code here
        int maxlen=0;
        int maxfreq=0;
        int l=0;
        int r=0;
        int[] hash=new int[26];
        while(r<n){//o(n)
            hash[s.charAt(r)-'a']++;
            maxfreq=Math.max(maxfreq,hash[s.charAt(r)-'a']);
            while(r-l+1-maxfreq>k){//o(n)
                hash[s.charAt(l)-'a']--;
                maxfreq=0;
                for(int i=0;i<26;i++){//o(26)
                    maxfreq=Math.max(maxfreq,hash[i]);
                    
                }
                l++;
            }
            if(r-l+1-maxfreq<=k){
                maxlen=Math.max(maxlen,r-l+1);
            }
            r++;
        }
            return maxlen;
        
    }

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        int ans = characterReplacement(n,k,s);
        System.out.println(ans);
    }
}
