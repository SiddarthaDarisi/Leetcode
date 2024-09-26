class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> res=new HashMap<>();
        for(String s:strs){
            int[] temp=new int[26];
            for(int i=0;i<s.length();i++){
             temp[(int)s.charAt(i)-'a']++;   
            }
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<temp.length;i++){
                sb.append("#");
                sb.append(temp[i]);
            }
            String key;
            key=sb.toString();
            if(!res.containsKey(key)){
                res.put(key,new ArrayList<>());
            }
            res.get(key).add(s);
           }

          return new ArrayList<>(res.values());
    }
}