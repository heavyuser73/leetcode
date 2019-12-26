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
        ListNode tempNode=null;
        int temp;
        int upNum = 0;
        int currentNum = 0;
        while(l1 !=null || l2 !=null) {
            temp = ((l1!=null)?l1.val:0) + ((l2!=null)?l2.val:0) + upNum;
            upNum = temp/10;
            currentNum = temp % 10;
            if(resultNode == null) {
                resultNode = new ListNode(currentNum);
                tempNode = resultNode;
            }
            else {
                tempNode.next = new ListNode(currentNum);
                tempNode = tempNode.next;
            }
            
            l1 = (l1 != null)?l1.next:null;
            l2 = (l2 != null)?l2.next:null;
        }
        if(upNum > 0) {
            tempNode.next = new ListNode(upNum);
        }
        
        return resultNode;
    }
}
