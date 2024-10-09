class Solution {
    public int minAddToMakeValid(String s) {
    int open =0, mismatch=0;
    for(int i=0; i<s.length(); i++)
    {
     if(s.charAt(i)=='(')
     open++;
     else
     {
        if(open>0)
        open--;
        else
        mismatch++;
     }
    } 
     return open+mismatch;   
    }
}
```C++
class Solution {
public:
    int minAddToMakeValid(string s) {
        int open = 0, mismatch = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s[i] == '(')
                open++;
            else {
                if (open > 0)
                    open--;
                else
                    mismatch++;
            }
        }
        return open + mismatch;
    }
};
```C# code
public class Solution {
    public int MinAddToMakeValid(string s) {
        int open = 0, mismatch = 0;
        for (int i = 0; i < s.Length; i++) {
            if (s[i] == '(')
                open++;
            else {
                if (open > 0)
                    open--;
                else
                    mismatch++;
            }
        }
        return open + mismatch;
    }
}
````Python code
class Solution(object):
    def minAddToMakeValid(self, s):
        """
        :type s: str
        :rtype: int
        """
        open_brackets = 0
        mismatch = 0
        for char in s:
            if char == '(':
                open_brackets += 1
            else:
                if open_brackets > 0:
                    open_brackets -= 1
                else:
                    mismatch += 1
        return open_brackets + mismatch
