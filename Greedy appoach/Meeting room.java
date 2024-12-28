import java.io.*;
import java.util.*;
import java.lang.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        String inputLine[] = br.readLine().trim().split(" ");
		int n = Integer.parseInt(inputLine[0]);

		int start[] = new int[n];
		int end[] = new int[n];

		inputLine = br.readLine().trim().split(" ");
		for (int i = 0; i < n; i++)
			start[i] = Integer.parseInt(inputLine[i]);

		inputLine = br.readLine().trim().split(" ");
		for (int i = 0; i < n; i++) 
			end[i] = Integer.parseInt(inputLine[i]);
			
		int ans = new Solution().maxMeetings(start, end, n);
		System.out.println(ans);
    }
}
class Meeting{
	int start;
	int end;
	int pos;

	Meeting(int s,int e,int p){
		start=s;
		end=e;
		pos=p;
	}
}

class meetingComparator implements Comparator<Meeting>{
	public int compare(Meeting a1,Meeting a2){
		if(a1.end<a2.end){
			return -1;
		}
		else if(a1.end>a2.end){
			return 1;
		}
		else if(a1.pos<a2.pos){
			return -1;
		}
		return 1;
	}
}

class Solution 
{
    public int maxMeetings(int start[], int end[], int n) 
    {
        //Write code here
		ArrayList<Meeting>arr=new ArrayList<>();
        for(int i=0;i<n;i++){
			arr.add(new Meeting(start[i],end[i],i+1));
		}
		meetingComparator mc=new meetingComparator();
		Collections.sort(arr,mc);
		ArrayList<Integer>ans=new ArrayList<>();
		ans.add(arr.get(0).pos);
		int freetime=arr.get(0).end;
		for(int i=1;i<n;i++){
			if(freetime<arr.get(i).start){
				ans.add(arr.get(i).pos);
				freetime=arr.get(i).end;
			}
		}
		return ans.size();
    }
}
