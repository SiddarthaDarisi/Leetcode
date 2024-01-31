class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ans = new HashMap<>();
        for(var s: strs){
String temp = s.chars()
                   .sorted()
                   .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                   .toString();
      if(!ans.containsKey(temp)){
        ans.put(temp,new ArrayList<>(Arrays.asList(s)));
      }else{
 ans.get(temp).add(s);
      }}
        List<List<String>> groupedAnagrams = new ArrayList<>();
        for (List<String> group : ans.values()) {
            groupedAnagrams.add(group);
        }

        return groupedAnagrams;
            
      
    }
}