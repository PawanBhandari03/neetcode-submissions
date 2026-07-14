class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    
    HashMap<String, ArrayList<String>> map = new HashMap<>();

    for(int i= 0; i< strs.length; i++){
        char[] arr = strs[i].toCharArray();
        Arrays.sort(arr);
        String key = new String(arr);
       
       if(map.containsKey(key)){
        map.get(key).add(strs[i]);
       }
       else{
        ArrayList<String> List = new ArrayList<>();
        List.add(strs[i]);
        map.put(key,List);
            }
        }
        return new ArrayList<>(map.values());       
    }
}
