import java.util.*;

class Solution {
    public String convert(String s, int nRows) {
        //Write code here
        //create array of arraylist
        if(nRows==1){
            return s;
        }
        ArrayList<String>[] arr=new ArrayList[nRows];
        for(int i=0;i<nRows;i++){
            arr[i]=new ArrayList<>();
        }
        int i=0,j=0;
        int dir=1;
        
        while(i<s.length()){
            String str1=""+s.charAt(i);
           arr[j].add(str1);
           if(dir>0){
            j++;
           }
           else{
            j--;
           }

           if(j==nRows){
            dir=-1*dir;
            j=nRows-2;
           }
           else if(j==-1){
            dir=-1*dir;
            j=1;
           }
           i++;
        }
        
        String str="";
        for(int k=0;k<nRows;k++){
            for(String arrayCharacter : arr[k]){
                str+=arrayCharacter;
            }
        }

        return str;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int numRows = sc.nextInt();
        Solution Obj = new Solution();
        String res = Obj.convert(s, numRows);
        System.out.println(res);
        sc.close();
    }
}