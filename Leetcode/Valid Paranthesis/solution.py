# https://leetcode.com/problems/valid-parentheses/

class Solution:
    def isValid(self, s: str) -> bool:
        closing_tags = {"(": ")", "{": "}", "[": "]"}
        stack = []
        for char in s:
            if char in closing_tags.keys():
                stack.append(char)

            elif char in closing_tags.values():
                if stack and closing_tags[stack[-1]] == char:
                    stack.pop()
                else:
                    return False
        
        return (False if stack else True)