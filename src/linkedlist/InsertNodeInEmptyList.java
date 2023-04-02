/**
 * 
 */
package linkedlist;

/**
 * @author reddy
 *
 */
public class InsertNodeInEmptyList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node headNode = new Node();
		Node node = new Node();
		node.data=2;
		headNode.next = node;
		System.out.println(headNode);
	}

}

