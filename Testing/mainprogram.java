public class mainprogram{
	public static void main(String[] args){
		
		LinkedList alif = new LinkedList();
		alif.push(1);
		alif.push(2);
		alif.push(3);
		alif.push(4);
		alif.push(5);
		alif.push(6);
		alif.printFromHead(alif.head);
		System.out.println(" ");
		alif.swapTail();
		alif.printFromHead(alif.head);
		
	}
}