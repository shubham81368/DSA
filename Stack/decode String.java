 static String decodeString(String s) {
        // code here
        Stack<Integer>countString=new Stack<>();
        Stack<String>stackString=new Stack<>();
        String curr="";
        int num=0;
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                num=num*10+(c-'0');
            }
            else if(c=='['){
                countString.push(num);
                stackString.push(curr);
                num=0;
                curr="";
            }
            else if(c==']'){
                StringBuilder decodeString=new StringBuilder(stackString.pop());
                int repeat=countString.pop();
                for(int i=1;i<=repeat;i++){
                    decodeString.append(curr);
                }
                curr=decodeString.toString();
            }
            else{
                curr+=c;
            }
            
        }
        return curr;
    }