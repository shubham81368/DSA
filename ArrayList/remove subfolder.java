class Solution {
    public List<String> removeSubfolders(String[] folder) {
        List<String>result=new ArrayList<>();
        //sort the folder lexicographly
        Arrays.sort(folder);


        result.add(folder[0]);//beacuase fist folder cant be subfolder

        for(int i=1;i<folder.length;i++){
            String curFolder=folder[i];
            String lastFolder=result.get(result.size()-1);
            lastFolder+="/";//to check the subfolder

            //if the curfolder not start with the last folder then add it to result
            if(!curFolder.startsWith(lastFolder)){
                result.add(curFolder);
            }

        }

        return result;
    }
}