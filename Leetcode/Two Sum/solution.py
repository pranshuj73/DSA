# https://leetcode.com/problems/two-sum/

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        a_len = len(nums)
        for i in range(a_len):
            for j in range(i+1, a_len):
                if (nums[i] + nums[j]) == target:
                    return ([i, j])