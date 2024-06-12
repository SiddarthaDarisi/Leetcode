

import static java.lang.Math.log;

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> totalComb=new ArrayList<>();
        List<Integer> currComb=new ArrayList<>();
        helper(1,n,k,totalComb,currComb);
        return totalComb;
        
    }
    public void helper(int r,int n,int k,List<List<Integer>> totalComb,List<Integer> currComb){
            if(currComb.size()>=k){
                totalComb.add(new ArrayList<>(currComb));
                return;
            }
            for(int i=r;i<=n;i++){
                currComb.add(i);
                helper(i+1,n,k,totalComb,currComb);
                currComb.remove(currComb.size() - 1);
            }
    }
}