 public int[][] kClosest(int[][] points, int k) {
        // Your code here
        int[][] res=new int[k][2];
        TreeMap<Integer,ArrayList<Integer>>arr=new TreeMap<>();
        for(int i=0;i<points.length;i++){
            int d=(int)Math.sqrt((points[i][0])^2 +(points[i][0])^2);
            arr.put(d,new ArrayList<>());
            arr.get(i).add(points[i][0]);
            arr.get(i).add(points[i][1]);
            
        }
    
        int i=0;
    
            for(int num:mp.values()){
                if(k==0)break;
            res[i][0]=num.get(0);
            res[i][1]=num.get(1);
            i++;
            k--;
            
        }
        return res;
    