class Solution:
    def groupAnagrams(self, strs):
        ans = {}
        for str in strs:
            
            key = tuple(sorted(str))
            
            if key not in ans:
                ans[key] = []
            
            ans[key].append(str)
        
        # Return the list of groups
        return list(ans.values())