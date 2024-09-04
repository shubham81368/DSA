class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        //intial point and intial distance
        int x=0;
        int y=0;
        int d=0;
        //four direction
        int direction[][] ={{0,1},{1,0},{0,-1},{-1,0}};
        //maxDistance
        int maxDistance=0;
        //for storing unique obstactles
        HashSet<String>obstacleSet = new HashSet();
        for(int[] obstacle:obstacles){
            obstacleSet.add(obstacle[0]+","+obstacle[1]);
        }
        //iterate on commands
        for(int cmd:commands){
            if(cmd==-1){//move left
                d=(d+1)%4;//becuse we have faur direction
            }
            else if(cmd==-2){//move down/right
                d=(d+3)%4;
            }
            else{//not containg -1 &-2means no obstacle are there
                for(int i=0;i<cmd;i++){
                    int nx=x+direction[d][0];
                    int ny=y+direction[d][1];
                    if(obstacleSet.contains(nx+","+ny)){
                        break;
                    }
                    x=nx;
                    y=ny;
                    maxDistance=Math.max(maxDistance,x*x+y*y);
 
                }
            }
        }

          return maxDistance;
    }
}