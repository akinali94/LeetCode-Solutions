//https://leetcode.com/problems/two-sum/

#include <undordered_map>

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> mapping;
        int n = nums.size();

        for(int i=0; i <n; i++){
            int complement = target - nums[i];
            if(mapping.count(complement)){
                return {mapping[complement], i};
            }
            mapping[nums[i]] = i;
        }
        return {};
    }
};