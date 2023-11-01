import java.util.*;
public class Search {
	Node head;
	class Node{
		int data;
		Node next;
		
		Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public void add(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		
		Node currNode = head;
		while(currNode.next!=null) {
			currNode=currNode.next;
		}
		currNode.next=newNode;
	}
	
	int Find(int element) {
		Node currNode=head;
		int index=0;
		
		while(currNode!=null) {
			if(currNode.data==element) {
				return index;
			}
			currNode=currNode.next;
			index++;
		}
		return -1;
	}
	
	public void display() {
		Node currNode = head;
		while(currNode!=null) {
			System.out.print(currNode.data+"->");
			currNode=currNode.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		Search list = new Search();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the no. of elements: ");
		int n = sc.nextInt();
		
		  System.out.println("Enter the elements:");
	        for (int i = 0; i < n; i++) {
	            int data = sc.nextInt();
	            list.add(data);
	        }
	        
	   list.display();
	   
	   //searching the input no.
	   System.out.print("Enter the element to search: ");
	   int element = sc.nextInt();
	   int index = list.Find(element);
	   
	   if(index!=-1) {
		   System.out.print(element+" found at "+index);
	   }
	   else {
		   System.out.print(element+" not found in linked list");
	   }

	}

}
