/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
 import java.util.Arrays;
 import java.util.*;
class LlComponents {
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        boolean isCom =  false;
        int result = 0;
        while( head != null){
            if(set.contains(head.val)){
            if(!isCom){
                isCom = true;
                result++;
            }
            }else{
                isCom = false;
            }

            head = head.next;

        }
        return result;
    }
}