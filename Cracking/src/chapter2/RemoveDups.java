package chapter2;

public class RemoveDups {

	/*
	 * removing duplicates from singly linked list without extra space (eg set)
	 */
	public void removeDups(Node head){
		
		Node curr = head;
		Node runnerPrev;
		
		
		while(curr != null && curr.next != null){
			
			Node runner = curr.next;
			runnerPrev = curr;
			
			while(runner != null && runner.next != null){
				
				if(curr.data == runner.data){
					
					runnerPrev.next = runner.next;
					runner = runnerPrev.next.next;

				} else{
					runnerPrev = runner;
					runner = runner.next;
				}
			}
			
			curr = curr.next;
		}		
	}
}
