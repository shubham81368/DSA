import java.util.*;

class Main
{

static ArrayList<Integer> removeComposite(int arr[], int len)
{
	ArrayList<Integer>ans=new ArrayList<>();


    for(int i=0;i<len;i++){
    if(isPrime(arr[i])){
        ans.add(arr[i]);
    }
    }
    return ans;
}

public static boolean isPrime(int num){
    for(int i=2;i<num;i++){
        if(num%i==0)return false;
    }
    return true;
}

public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
    }
	ArrayList<Integer> list = removeComposite(arr, n);
    for(int val : list) System.out.print(val+" ");

}
}
