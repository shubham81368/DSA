
// A Java program to print all anagrams together
import java.util.*;

public class Main {
    // Given a list of words in wordArr[],
    static void printAnagramsTogether(String w[], int size) {
        //your code here
        HashMap<String,ArrayList<String>>mp=new HashMap<>();
        for(int i=0;i<size;i++){
            //tmp->freq wali string leke aajao
            String tmp=genfreqOfString(w[i]);

            if(mp.containsKey(tmp)){
                mp.get(tmp).add(w[i]);
            }
            else{
                mp.put(tmp,new ArrayList<String>());//first create arraylist for containsKey
                mp.get(tmp).add(w[i]);
            }
        }
     //print anagrams sorted wise
     ArrayList<String>sortedList=new ArrayList<>();

     for(String s:mp.keySet()){
        sortedList.add(mp.get(s).get(0));
     }
     Collections.sort(sortedList);
     for(int i=0;i<sortedList.size();i++){
        String tmp=genfreqOfString(sortedList.get(i));
        for(int j=0;j<mp.get(tmp).size();j++){
            System.out.print(mp.get(tmp).get(j)+" ");
        }
     }

    }

   static String genfreqOfString(String s){
        String tmp="";
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        char ch='a';
        for(int i=0;i<26;i++){
            tmp+=(ch+freq[i]);
            ch++;
        }
        return tmp;
    }

    // Driver program to test above functions
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] wordArr = new String[n];
        for (int i = 0; i < n; i++)
            wordArr[i] = sc.next();
        sc.close();
        printAnagramsTogether(wordArr, n);
    }
}