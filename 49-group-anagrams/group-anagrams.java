class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> data=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] x=strs[i].toCharArray();
            Arrays.sort(x);
            String key=new String(x);
            if(!data.containsKey(key)){
                data.put(key,new ArrayList<>());
            }
            data.get(key).add(strs[i]);
        }
        return new ArrayList<>(data.values());
    }
}
// what i did in this question::
//   We created a hashmap and then we will start a for loop which will go to each value in strs and then sort it, after that it check if there is any key in our hashmap which is same as the value at strs[i] 
//   if true then it simply add the strs[i] to that arraylist else it will create a key with empty arraylist in it and add it to the hash