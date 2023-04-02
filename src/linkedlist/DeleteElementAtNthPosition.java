/**
 * 
 */
package linkedlist;

/**
 * @author reddy
 *
 */
public class DeleteElementAtNthPosition {

	/**
	 * @param args
	 */
	static Node headNode = new Node();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertNodeAtEndOfList.insertAtTheEnd(new Node(2), headNode);
		InsertNodeAtEndOfList.insertAtTheEnd(new Node(5), headNode);
		InsertNodeAtEndOfList.insertAtTheEnd(new Node(8), headNode);
		InsertNodeAtEndOfList.insertAtTheEnd(new Node(9), headNode);
		InsertNodeAtEndOfList.insertAtTheEnd(new Node(10), headNode);
		InsertNodeAtEndOfList.insertAtTheEnd(new Node(15), headNode);
		System.out.println(headNode);
		DeleteNodeAtPostion(0);
		System.out.println(headNode);
		DeleteNodeAtPostion(3);
		System.out.println(headNode);
		DeleteNodeAtPostion(2);
		System.out.println(headNode);
		DeleteNodeAtPostion(1);
		System.out.println(headNode);
		DeleteNodeAtPostion(3);
		System.out.println(headNode);
	}
	private static void DeleteNodeAtPostion(int i) {
		// TODO Auto-generated method stub
		if(i>0){
			Node node = headNode;
			if(i == 1){
				headNode = node.next;
				return;
			}
			for (int j = 0; j < i-2; j++) {
				node = node.next;
			}
			//System.out.println(node);
			Node node2 = node.next;
			node.next = node2.next;
		}
	}
}