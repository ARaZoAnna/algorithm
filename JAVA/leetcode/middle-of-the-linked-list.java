//https://leetcode.com/problems/middle-of-the-linked-list/

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
class Solution {
    /*
        워커 러너 테크닉
        walker : 한번에 한칸씩
        runner : 한번에 두칸씩
        runner가 끝나면 walker는 중간에 와있음
        while loop 마다
        러너 1칸 전진 워커 1칸 전진 러너 1칸 전진
    */
    public ListNode middleNode(ListNode head) {
        ListNode walker = head;
        ListNode runner = head;

        while(runner != null){
            runner = runner.next;
            if(runner == null) break;
            walker = walker.next;
            runner = runner.next;
            if(runner == null) break;
        }

        return walker;
    }
}
