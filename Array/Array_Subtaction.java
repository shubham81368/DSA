// Java program to sum two numbers
// represented two arrays.
import java.util.*;

public class Main {

  static int[] subtract(int[] n1, int[] n2) {
    // your code here
 int size=n1.length>n2.length?n1.length:n2.length;
    int ans[] =new int[size];
    int l1=n1.length;
    int l2=n2.length;
    //check array 1 is larger or not
    if(l1>l2){
        subtraction(n1,n2,ans);
    }
    else if(l2>l1){
        System.out.print("-");
        subtraction(n2,n1,ans);
    }
    else{//here both array length equal
        for(int i=0;i<l1;i++){
            if(n1[i]>n2[i]){
                subtraction(n1,n2,ans);
                break;
            }
            else if(n1[i]<n2[i]){
                System.out.print("-");
                subtraction(n2,n1,ans);
                break;
            }else{
                continue;
            }
            }
        }
        return ans;
    }
     
  

  public static void subtraction(int[] n1,int[] n2,int[] ans){
     
    int i=n1.length-1,j=n2.length-1;
    int k=ans.length-1;
    
    while(j>=0){//why we consider j because length of n2 array is smaller then n1 array length
    
       if(n1[i]>=n2[j]){
        ans[k]=n1[i]-n2[j];
        
       }
       else{
          ans[k]=10+n1[i]-n2[j];
          n1[i-1]--;
       }
       i--;
       j--;
       k--;
    }
    //if n1 array left
    while(i>=0){//i is of bigger length that why it left
        ans[k]=n1[i];
        i--;
        k--;
    }

  }


  /* Driver program to test above function */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int[] arr1 = new int[n1];
    for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

    int n2 = sc.nextInt();
    int[] arr2 = new int[n2];
    for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();
    sc.close();

    int[] res = subtract(arr1, arr2);
    for (int i : res) System.out.println(i);
  }
}