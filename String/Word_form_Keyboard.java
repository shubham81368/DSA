import java.io.*;
import java.util.*;

public class Main {

    static ArrayList<String> getStrings(ArrayList<String> arr)
    {  
        // write your code here
        //first create 3 size keyBoard string Array
        String[] keyBoard = new String[3];
        keyBoard[0]="qwertyuiop";
        keyBoard[1]="asdfghijkl";
        keyBoard[2]="zxcvbnm";

        //we have to print sting so we create first
        ArrayList<String>s =new ArrayList<>();
        for(int i=0;i<arr.size();i++){
           
            for(int j=0;j<3;j++){
                
            boolean flag=true;
                for(int k=0;k<arr.get(i).length();k++){
                    if(!keyBoard[j].contains(String.valueOf(arr.get(i).charAt(k)))){
                        flag=false;
                        break;
                    }       
                }
                 if(flag){
                        s.add(arr.get(i));
                        break;//kyoki hamara word row 1 me he mil gya ab dusre row me check karne ki jarurat nhi hai
                    }
            }
            
        }
        return s;
    }

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
    
        int n = sc.nextInt();
        ArrayList<String> arr = new ArrayList<String>();
        for(int i = 0; i < n; i++){
            String s = sc.next();
            arr.add(s);
        }

        ArrayList<String> result = getStrings(arr);
        for(int i = 0; i < result.size(); i++){
            System.out.println(result.get(i));
        }
    }
}
