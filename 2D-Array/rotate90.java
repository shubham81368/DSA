        int n=matrix.length;
        
        
       int l=0;
       int r=n-1;
       
       for(int op=0;op<n/2;op++){
           for(int i=l;i<r;i++){
               
               int top_left=matrix[l][i];
               int top_right=matrix[i][r];
               int bottom_left=matrix[n-1-i][l];
               int bottom_right=matrix[n-1-l][n-1-i];
               
               matrix[l][i]=bottom_left;
               matrix[i][r]=top_left;
               matrix[n-1-i][l]=bottom_right;
               matrix[n-1-l][n-1-i]=top_right;
           }
           l++;
           r--;
       }
    }