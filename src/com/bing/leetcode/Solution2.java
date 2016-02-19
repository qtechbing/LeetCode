package com.bing.leetcode;

public class Solution2 {

	public static void main(String[] args) {
		

	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
			
		ListNode l3 = new ListNode(0);
		ListNode li = new ListNode(0);
		ListNode p = li;
		l3.next = li;
		int carry = 0; // ��λ
		while(l1 !=null && l2 != null)
		{
			int result = l1.val + l2.val + carry;
			carry = result / 10;
			li.val = result % 10;
			li.next = new ListNode(0);
			p = li; // p��������Ϊ��ɾ�������ж����0
			li = li.next;
			l1 = l1.next;
			l2 = l2.next;
		}
		
		if(l1 != null)
		{
		    while(l1 != null)
		    {
		        int result = l1.val + carry;
			    carry = result / 10;
			    li.val = result % 10;
				li.next = new ListNode(0);
				p = li;
				li = li.next;
				l1 = l1.next;
		    }
		    
		    li.val = carry;
		}
		else if(l2 != null) 
		{
			while(l2 != null)
		    {
		        int result = l2.val + carry;
			    carry = result / 10;
			    li.val = result % 10;
				li.next = new ListNode(0);
				p = li;
				li = li.next;
				l2 = l2.next;
		    }
		    
		    li.val = carry;
		}
		else
		{
		    li.val = carry;
		}
		
		if(li.val == 0)
		{
		    p.next = null;
		}
		
		return l3.next;    
	}	
	class ListNode {
		int val;
		ListNode next;
		public ListNode(int x) 
		{ 
			val = x; 
		}
	} 

}
