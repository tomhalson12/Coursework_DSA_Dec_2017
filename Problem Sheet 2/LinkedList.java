public class LinkedList{
	private ListNode head = null;
	private int n = 0; // list size
	private ListNode tail = null;

	public void addFirst(Object o){
		head = new ListNode(o, head);
		if(n==0){
			tail = head;
		}
		n++;
	}

	public void add(Object o){
		if(n==0){
			head = new ListNode(o, head);
			tail = head;
		}else{
			tail.next = new ListNode(o, tail.next);
			tail = tail.next;
		}
		n++;
		
	}

	public Object get(int i){
		if(!(i<0 || i>=n)){
			ListNode node = head;
			for(int j=0; j<i; j++){
				node = node.next;
			}
			return node.element;
		}else{
			return null;
		}
	}

	public void insert(Object o, int i){

		if(!(i<0 || i>n)){
			if(i == 0){
				addFirst(o);
			}else{
				ListNode node = head;
				for(int j =0; j<i-1; j++){
					node = node.next;
				}
				node.next = new ListNode(o, node.next);

				if(i == n){
					tail = node.next;
				}
				

				n++;
			}
		}
	}

	public void remove(int i){
		if(!(i<0 || i>n)){
			if(i == 0){
				head = head.next;
				n--;
			}else{
				ListNode node = head;
				for(int j =0; j<i-1; j++){
					node = node.next;
				}
				node.next = node.next.next;

				if(i == n-1){
					tail = node;
				}
				n--;
			
			}
		}
	}

}