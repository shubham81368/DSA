class Solution {

    String roundToNearest(String str) {
        // Complete the function
      int i=str.length()-1;//ham last digit se pta chalega carry lena hai ya nhi
      int carry=0;
      if(str.charAt(i)-'0'>5)carry++;
      
      StringBuilder sb =new StringBuilder();
      sb.append("0");
      i--;
      
      while(i>=0){
          
          int val=str.charAt(i)-'0'+carry;
          sb.insert(0,val%10);
          carry=val/10;
          i--;
      }
      
      if(carry>0){
          sb.insert(0,"1");
      }
      return sb.toString();
    }
}