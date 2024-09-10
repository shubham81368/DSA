import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> triangle = pascalTriangle(n);
        for (int i = 0; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                System.out.print(triangle.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

	public static ArrayList<ArrayList<Integer>> pascalTriangle(int numRows) {
        // write code here
        ArrayList<ArrayList<Integer>>res=new ArrayList<>();
        ArrayList<Integer>prev = new ArrayList<>();
        prev.add(1);//kykoi hamare test case me agar ek he no. of  rows hai to ek baar add hoga
        res.add(prev) ;
        if(numRows==1){
            return res;
        }
        //agar ek se jada row hai to startng or ending elment one hoga/
        //or jo intermediate me aayega vo prev(i)+prev(i-1) ka sum karke aayegyega

        for(int i=2;i<=numRows;i++){
            ArrayList<Integer>currRow=new ArrayList<>();
            currRow.add(1);
            for(int j=1;j<i-1;j++){//yahana j <n-1 one liye hai kyoki har baar last place pe one add karna hai or starting one ha
              currRow.add(prev.get(j)+prev.get(j-1));
            }
            currRow.add(1);

          res.add(currRow);
          prev=currRow;//har baar row down jayega jidki wajh se har baar prev row update karna hoga
        }
        return res;
    }
}
