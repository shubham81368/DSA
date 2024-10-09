/*class Node

class Node
{
   int data;
   Node right,down;

   Node(int data){
       this.data = data;
       right = null;
       down = null;
   }
}
*/
/*Function should return the head of the 2D LL.*/
//time complexity -O(n*n);
//space complexity - O(n*n)
class Solution {
    static Node construct(int arr[][]) {
        // Add your code here.
        int n=arr.length;
        int m=arr[0].length;
        Node[][] mat=new Node[n][m];//o(n*n)
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=new Node(arr[i][j]);
            }
        }
        
        for(int i=0;i<n;i++){//o(n*n)
            for(int j=0;j<m;j++){
                if(j<m-1)mat[i][j].right=mat[i][j+1];//ham ne ek kam liya hai kyoki out of bound aayega
                if(i<n-1)mat[i][j].down=mat[i+1][j];
            }
        }
        return mat[0][0];
    }
}