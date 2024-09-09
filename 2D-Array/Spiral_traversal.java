import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int [][]mat=new int[n][m];
        for(int i=0;i<n;++i){
            for(int j=0;j<m;++j){
                mat[i][j]=sc.nextInt();
            }
        }

        spirallyTraverse(mat);     
        System.out.println('\n');
    }

    public static void spirallyTraverse(int [][]mat) {
       // your code here
         int rowStart=0,colStart=0;
         int rowEnd=mat.length-1;
         int colEnd=mat[0].length-1;

        while(rowStart<=rowEnd && colStart<=colEnd){
         //first row
         for(int i=colStart;i<=colEnd;i++){
            System.out.print(mat[rowStart][i]+" ");
         }
         rowStart++;

         //last column
         for(int i=rowStart;i<=rowEnd;i++){
            System.out.print(mat[i][colEnd]+" ");
         }
         colEnd--;

         //last row
         if(rowStart<=rowEnd){//kyoki uper row plus hua hai
         for(int i=colEnd;i>=colStart;i--){
            System.out.print(mat[rowEnd][i]+" ");
         }}
         rowEnd--;

         //first column
         if(colStart<=colEnd){//uper column minus hua hai
         for(int i=rowEnd;i>=rowStart;i--){
            System.out.print(mat[i][colStart]+" ");
         }}
         colStart++;
        }
    }
}