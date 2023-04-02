/**
 * 
 */
package linkedlist;

/**
 * @author reddy
 *
 */
public class InsertNodeAtBeginning {

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

		Node node4 = new Node();
		node4.data = 1;
		
		insertAtTheBeginning(node4,headNode);
		System.out.println(headNode);
	}

	private static void insertAtTheBeginning(Node node4, Node headNode) {
		Node temp = headNode.next;
		headNode.next = node4;
		node4.next = temp;	
	}

	private static void insertAtTheEnd(Node node2, Node headNode) {

		Node temp = headNode;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = node2;
		
	}
}