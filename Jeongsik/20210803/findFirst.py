'''
Given an array of integers nums sorted in ascending order, 
find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

Example 1:
    Input: nums = [5,7,7,8,8,10], target = 8
    Output: [3,4]
Example 2:
    Input: nums = [5,7,7,8,8,10], target = 6
    Output: [-1,-1]
Example 3:
    Input: nums = [], target = 0
    Output: [-1,-1]
Constraints:

    0 <= nums.length <= 105
    -109 <= nums[i] <= 109
    nums is a non-decreasing array.
    -109 <= target <= 109
'''
class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        stack = []
        for seq, value in enumerate(nums):
            if value == target :
                stack.append(seq)

        if not stack :
            return [-1, -1]
        else :
            return [stack[0], stack[-1]]
            

sol = Solution()    
sol.searchRange([5,7,7,8,8,10], 6)