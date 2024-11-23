class Solution {
    public boolean isValid(String s) {
        Stack<Character> parentheses = new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='(' || c=='{' || c=='[')
            {
                parentheses.add(c);
                
            }else {
                if (parentheses.isEmpty()) {
                    return false;
                }
                char top = parentheses.pop();
                    if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }  
         return parentheses.isEmpty();
    }
}