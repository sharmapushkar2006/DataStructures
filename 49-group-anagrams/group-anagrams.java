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