class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
public class addTwoNums {
    int carry;
public ListNode addTwoNum(ListNode l1, ListNode l2) {
    ListNode dummyHead = new ListNode(0);
    ListNode p = l1, q = l2, curr = dummyHead;
    carry = 0;
    while (p != null || q != null) {
        int x = (p != null) ? p.val : 0;
        int y = (q != null) ? q.val : 0;
        int sum = carry + x + y;
        carry = sum / 10;
        curr.next = new ListNode(sum % 10);
        curr = curr.next;
        if (p != null) p = p.next;
        if (q != null) q = q.next;
    }
    if (carry > 0) {
        curr.next = new ListNode(carry);
    }
    return dummyHead.next;
    }
    public static void main(String [] args) {
        int [] num1 = {2, 4, 3};
        int [] num2 = {5, 6, 4};
        addTwoNums s = new addTwoNums();
        int cur = 0;
        for (int i = 0; i < num1.length; i++) {
             ListNode l1 = new ListNode(num1[i]);
             ListNode l2 = new ListNode(num2[i]);


            if (i < (num1.length - 1)) {

                System.out.print(s.addTwoNum(l1, l2).val + " -> ");
                cur = s.carry;

            }
             if (i == (num1.length - 1))
                System.out.println(s.addTwoNum(l1, l2).val + cur);




        }

    }
}