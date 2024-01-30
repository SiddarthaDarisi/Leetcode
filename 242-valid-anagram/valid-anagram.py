class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if(len(s)!=len(t)):
            return False    
        r={}
        for ch in s:
            if(ch in r):
                r[ch]=r[ch]+1
            else:
                r[ch]=1
        for ch in t:
            if(ch in r):
                r[ch]=r[ch]-1
                if(r[ch]==0):
                    del r[ch]
            else:
                return False

        return True