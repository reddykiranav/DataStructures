package linkedlist;

import java.util.Scanner;

public class InsertElementAtNthPosition {

	static Node headNode =new Node();

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		for(int i = 0;i<5;i++){
			System.out.println("Please enter the element to be entered:");
			int data =scanner.nextInt();
			System.out.println("Please enter the position at which it has to be entered:");
			int n = scanner.nextInt();
			Node node = new Node();
			node.data = data;
			insertAtTheNPosition(node,n);
			System.out.println(headNode);
		}

	}

	private static void insertAtTheNPosition(Node node, int n) {
		// TODO Auto-generated method stub
		Node temp = headNode;
		int i = 1;
		for (;i < n; i++) {
			if(temp.next != null){
				temp = temp.next;	
			}else{
				break;
			}
		}
		if(n<=i && n > 0){
			node.next = temp.next;
			temp.next = node;
		}else{
			System.err.println("Invalid Position");;
		}
	}
}