  public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        HashMap<String,ArrayList<String>>mp=new HashMap<>();
        
        for(String s:arr){
            char[] charArray=s.toCharArray();
            Arrays.sort(charArray);
            String sortedString=new String(charArray);
            if(!mp.containsKey(sortedString)){
                mp.put(sortedString,new ArrayList<String>());
            }
            mp.get(sortedString).add(s);
        }
        
        ArrayList<ArrayList<String>>ans=new ArrayList<>();
        
        //sort each groupt lexicographically
        for(ArrayList<String>group:mp.values()){
            // Collections.sort(group);
            ans.add(group);
        }
        
        //now sort each group lexicographically
        Collections.sort(ans,(a,b)->a.get(0).compareTo(b.get(0)));//because string compare
        return ans;
    }