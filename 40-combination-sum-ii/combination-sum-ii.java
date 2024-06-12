class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> totalSet = new ArrayList<>();
        List<Integer> currSet = new ArrayList<>();
        Arrays.sort(candidates);
        helper(0, currSet, 0, totalSet, candidates, target);
        return totalSet;
    }

    public void helper(int start, List<Integer> currSet, int currSum, List<List<Integer>> totalSet, int[] candidates, int target) {
        if (currSum == target) {
            totalSet.add(new ArrayList<>(currSet));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue; 
            }

            int newSum = currSum + candidates[i];
            if (newSum > target) {
                break; 
            }

            currSet.add(candidates[i]);
            helper(i + 1, currSet, newSum, totalSet, candidates, target);
            currSet.remove(currSet.size() - 1); // Backtrack
        }
    }
}