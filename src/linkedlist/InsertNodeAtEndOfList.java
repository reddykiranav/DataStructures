/**
 * 
 */
package linkedlist;

/**
 * @author reddy
 *
 */
public class InsertNodeAtEndOfList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node headNode = new Node();
		Node node = new Node();
		node.data=2;
		headNode.next = node;
		
		Node node2 = new Node();
		node2.data = 4;
		insertAtTheEnd(node2,headNode);
		
		Node node3 = new Node();
		node3.data = 6;
		insertAtTheEnd(node3, headNode);
		System.out.println(headNode);
	}

	protected static void insertAtTheEnd(Node node2, Node headNode) {
		if(headNode == null){
			headNode = node2;
			return;
		}
		
		while (headNode.next != null) {
			headNode = headNode.next;
		}
		
		headNode.next = node2;
	}

}

class Node{
	
	int data;
	Node next;
	
	public Node(int i) {
		// TODO Auto-generated constructor stub
		this.data = i;
	}

	public Node() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return " " + data + " " + next;
	}
	
}
