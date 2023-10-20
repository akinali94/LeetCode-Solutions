//https://leetcode.com/problems/merge-two-sorted-lists/

class Solution {
public:
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        ListNode *temp_node = new ListNode(-1);
        ListNode *current_node = temp_node;
        
        while(list1 != nullptr && list2 != nullptr){
            if(list1->val <= list2->val){
                current_node->next = list1;
                list1 = list1->next;
            }else{
                current_node->next = list2;
                list2 = list2->next;
            }
            current_node = current_node->next;
        }
        
        if(list1 != nullptr) current_node->next = list1;
        else if(list2 != nullptr) current_node->next = list2;
        
        return temp_node->next;
    }
};