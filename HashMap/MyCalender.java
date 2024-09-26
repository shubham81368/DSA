class MyCalendar {
    TreeMap<Integer,Integer>mp;//s.c-O(n)
    public MyCalendar() {
        mp=new TreeMap<>();
    }
 //   t.c-O(1000*log(n))kyoki array ka size 1000 hai
    public boolean book(int start, int end) {
        Integer prevVal=mp.lowerKey(end);//O(logN)
        //sbse max val lake deta hai prev interval ka  
        if(prevVal !=null && start<=(mp.get(prevVal)-1)){
            //yahan agar start value chota hai prevVal ke end se to false retrun hoga
            return false;
        }
        mp.put(start,end);//O(llogN)
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */