import java.io.*; 
import java.util.*;

public class Main { 

    public static int leastInterval(String tasks, int k) {
          // write your code here
          int[] c=new int[26];
          for(int i=0;i<tasks.length();i++){
              c[tasks.charAt(i)-'A']++;
          }

          PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
          for(int i=0;i<26;i++){
            if(c[i]>0){
                pq.offer(c[i]);
            }
          }

          int time=0;
          while(!pq.isEmpty()){
            int cycle=k+1;
            List<Integer>temp=new ArrayList<>();
            int taskcnt=0;
            while(cycle-->0 && !pq.isEmpty()){
                int currfreq=pq.poll();
                if(currfreq>1){
                    temp.add(currfreq-1);

                }
                taskcnt++;
            }
            //ab jo jo freq baki hai usko dubara pq me daal denge
            for(int freqleft:temp){
                pq.offer(freqleft);
            }
            if(pq.isEmpty()){
                time+=taskcnt;
            }
            else{
               time+=k+1;
            }
          }
          return time;
    }

    public static void main(String args[]) {
         
         Scanner input = new Scanner(System.in);
         int n = input.nextInt();
         int k = input.nextInt(); 
         String tasks = input.next();   
         int time = leastInterval(tasks , k);
         System.out.println(time); 

    }
}