/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultNode=null;
        ListNode lastNode=null;
        int temp;
        int addNum = 0;
        int currentNum = 0;
        while(l1 !=null || l2 !=null) {
            temp = ((l1!=null)?l1.val:0) + ((l2!=null)?l2.val:0) + addNum;
            addNum = (int)(temp/10);
            currentNum = temp % 10;
            if(resultNode == null) {
                resultNode = new ListNode(currentNum);
                lastNode = resultNode;
            }
            else {
                lastNode.next = new ListNode(currentNum);
                lastNode = lastNode.next;
            }
            
            l1 = (l1 != null)?l1.next:null;
            l2 = (l2 != null)?l2.next:null;
        }
        if(addNum > 0) {
            lastNode.next = new ListNode(addNum);
        }
        
        return resultNode;
    }
}
