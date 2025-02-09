import java.util.*;
class Pair{
    int value;
    int snapId;
    Pair(int s,int v){
        snapId=s;
        value=v;
    }
}

public class Main
{

    static List<List<Pair>>arr;
    static int snapId;
    public static void SnapshotArray(int length) {
        arr=new ArrayList<>();
        snapId=0;
        for(int i=0;i<length;i++){
            arr.add(new ArrayList<>());
            arr.get(i).add(new Pair(0,0));
        }
    }

    public static void set(int index, int val) {
       arr.get(index).add(new Pair(snapId,val));
    }

    public static int snap() {
         snapId++;
         return snapId-1;
    }

    public static int get(int index, int snap_id) {
        List<Pair>list=arr.get(index);
        int s=0;
        int e=list.size()-1;
        int ans=-1;
        while(s<=e){
            int mid=(s+(e-s)/2);
            if(list.get(mid).snapId<=snap_id){
                ans=list.get(mid).value;
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return ans;
    }
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String temp;
		int param1, param2;
		param1 = input.nextInt();
        SnapshotArray(param1);
        String[] arr = new String[n];
		for (int i = 0; i < n; i++){

            temp = input.next();
		    if(temp.equals("set") || temp.equals("get"))
            {
              param1 = input.nextInt();
              param2 = input.nextInt();
              if(temp.equals("set"))
              {
                  set(param1, param2);
              }
              else{
                  System.out.println(get(param1, param2));
              }
            }
            else{
                System.out.println(snap());
            }
		}
        
	}
}
