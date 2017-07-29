public class AddTwoNumbers {
	
	public static class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode ret = null;
		ListNode curr = null, temp=null;
		int carry = 0;
        while(l1!=null || l2!=null){
        	int p=0,q=0;
        	if(l1!=null)
        		p = l1.val;
        	if(l2!=null)
        		q = l2.val;
        	temp = new ListNode((p+q+carry)%10);
        	carry = (p+q+carry)/10;
        	//curr = curr.next;
        	if(ret==null){
        		ret = temp;
        		curr = ret;
        	}
        	else{
        		curr.next = temp;
        		curr = curr.next;
        	}
        	if(carry > 0)
        		curr.next = new ListNode(carry);
        	
        	if(l1!=null)
        		l1 = l1.next;
        	if(l2!=null)
        		l2 = l2.next;
        }
        return ret;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode list1 = new ListNode(5);
		list1.next = new ListNode(4);
		
		ListNode list2 = new ListNode(5);
		list2.next = new ListNode(5);
		/*ListNode list2 = null;*/
		/*System.out.println(addTwoNumbers(list1,list2));*/
		
		ListNode outputList = addTwoNumbers(list1, list2);
		while(outputList!=null){
			System.out.println("Hello");
			System.out.println(outputList.val);
			outputList = outputList.next;
		}
	}

}
