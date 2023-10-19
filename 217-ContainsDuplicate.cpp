//https://leetcode.com/problems/contains-duplicate/

class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        map<int, int> mapping;
        for(int i = 0; i<nums.size(); i++){
            if(mapping[nums[i]]){
                return true;
            }
            mapping[nums[i]]++;
        }
        return false;
    }
};