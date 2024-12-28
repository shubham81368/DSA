  public List<List<Integer>> findTriplets(int[] arr) {
        // Your code here
        int n=arr.length;
        List<List<Integer>>res=new ArrayList<>();
        HashMap<Integer,List<int[]>>mp=new HashMap<>();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int sum=arr[i]+arr[j];
                if(!mp.containsKey(sum)){
                    mp.put(sum,new ArrayList<>());
                }
                mp.get(sum).add(new int[]{i,j});
        }
        }
        
        for(int i=0;i<n;i++){
            int rem=-arr[i];
            if(mp.containsKey(rem)){
                for(int[] p:mp.get(rem)){
                    if(p[0]<i&&p[1]<i){
                        List<Integer>temp=Arrays.asList(p[0],p[1],i);
                        res.add(temp);
                    }
                }
            }
        }
        return res;
    }