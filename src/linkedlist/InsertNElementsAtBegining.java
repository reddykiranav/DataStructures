/**
 * 
 */
package linkedlist;

import java.util.Scanner;

/**
 * @author reddy
 *
 */
public class InsertNElementsAtBegining {
	
	static Node headNode = null;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner scanner = new Scanner(System.in);
		for(int i = 0;i<5;i++){
			System.out.println("Please enter the element to be entered:");
			int data =scanner.nextInt();
			Node node = new Node();
			node.data = data;
			insertAtTheBegining(node);
			System.out.println(headNode);
		}
	}

	private static void insertAtTheBegining(Node node) {
		// TODO Auto-generated method stub
	//	if (headNode == null){
		//	headNode = node;
		//}//else{ 
			node.next = headNode;
			headNode = node;
		//}
	}
}