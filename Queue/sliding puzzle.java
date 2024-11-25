class Solution {
    public int slidingPuzzle(int[][] board) {
        StringBuilder start=new StringBuilder();
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                start.append(board[i][j]);
            }
        }

        String target="123450";
        Queue<String>q=new LinkedList<>();
        q.add(start.toString());
        //position representing adjacency list
        HashMap<Integer,int[]>map=new HashMap<>();
        map.put(0,new int[]{1,3});
        map.put(1,new int[]{0,2,4});
        map.put(2,new int[]{1,5});
        map.put(3,new int[]{0,4});
        map.put(4,new int[]{1,3,5});
        map.put(5,new int[]{2,4});

        //visited array leke chalenge taki same me vapas aaye to pta chal jaye
        Set<String>visited=new HashSet<>();
        visited.add(start.toString());

        int level=0;//track number moves;

        while(!q.isEmpty()){
            int n=q.size();
            //queue ko traverse karnege
            for(int i=0;i<n;i++){
                String curr=q.poll();

                //if curr==target the we return move
                if(curr.equals(target)){
                    return level;
                }
                int indexOfZero=curr.indexOf('0');//find the index of '0'
                for(int swapIdx:map.get(indexOfZero)){
                    char[] newStateArray=curr.toCharArray();
                    //swap the position
                    char temp=newStateArray[indexOfZero];
                    newStateArray[indexOfZero]=newStateArray[swapIdx];
                    newStateArray[swapIdx]=temp;

                    String newState=new String(newStateArray);

                    if(!visited.contains(newState)){
                        q.add(newState);
                        visited.add(newState);
                    }
                }
            }
            level++;
        }
        return -1;
    }
}