class Solution {
    int result=Integer.MAX_VALUE;
    public int takeCharacters(String s, int k) {
        int freq[]=new int[3];
        
        int count_a=0;
        int count_b=0;
        int count_c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                count_a++;
            }
            else if(s.charAt(i)=='b'){
                count_b++;
            }
            else if(s.charAt(i)=='c'){
                count_c++;
            }
        }
        if(count_a<k || count_b<k || count_c<k){
            return -1;
        }
        int i=0;
        int j=0;
        int deletedWindowSize=0;
        int n=s.length();
        
        while(j<n){
            if(s.charAt(j)=='a'){
                count_a--;
            }
            else if(s.charAt(j)=='b'){
                count_b--;
            }
            else if(s.charAt(j)=='c'){
                count_c--;
            }

            while(i<=j && (count_a<k ||count_b<k || count_c<k)){
                if(s.charAt(i)=='a'){
                    count_a++;
                }
                else if(s.charAt(i)=='b'){
                    count_b++;
                }
                else if(s.charAt(i)=='c'){
                    count_c++;
                }
                i++;
            }
            deletedWindowSize=Math.max(deletedWindowSize,j-i+1);
            j++;
        }

       return n-deletedWindowSize;
    }


}