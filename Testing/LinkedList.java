public class LinkedList{
	public Node head = null;
	
	public void push(int data){
		Node temp = new Node();
		temp.setData(data);
		if(head == null){
			head = temp;
		}
		else{
			temp.setNext(head);
			head = temp;
		}
	}
	
	public void printFromHead(Node node){
		if(node == null){
			return;
		}
		System.out.print(node.getData() + "  ");
		printFromHead(node.getNext());
		
	}
	
	
	public void swapTail(){
		Node temp = head;
		Node prev = null;
		while(temp.getNext() != null){
			prev = temp;
			temp = temp.getNext();
		}
		prev.setNext(null);
		temp.setNext(head);
		head = temp;
	}
}