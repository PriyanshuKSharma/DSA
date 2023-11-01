import java.util.*;
public class LL {
	Node head;
	private int size;
	
	LL() {
		this.size=0;
	}
	
	class Node {
		String data;
		Node next;
		
		Node(String data) {
			this.data=data;
			this.next=null;
			size++;
		}
	}
	
	//add first
	public void addfirst(String data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
			return;
		}
		
		newNode.next=head;
		head=newNode;
	}
	
	//add last
	public void addLast(String data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
			return;
		}
		
		Node currNode = head;
		while(currNode.next != null) {
			currNode = currNode.next;
		}
		
		currNode.next=newNode;
	}
	
	//search in linked list
		int Search(String key) {
			//key="list";
			Node currNode = head;
			int index=0;
			while(currNode!=null) {
				if(currNode.data==key) {
					return index;
				}
				currNode=currNode.next;
				index++;
			}
			return -1; //if key not found
		}
	
	//delete first
	public void deletefirst() {
		if(head==null) {
			System.out.print("The list is empty");
			return;
		}
		
		head=head.next;
		size--;
	}
	
	//delete last
	public void deltelast() {
		if(head==null) {
			System.out.print("The list is empty");
			return;
		}
		
		size--;
		if(head.next==null) {
			head=null;
			return;
		}
		
		Node secondlast = head;
		Node lastNode = head.next;
		
		while(lastNode.next != null) {
			lastNode = lastNode.next;
			secondlast = secondlast.next;
		}
		
		secondlast.next=null;
	}
	
	
	
	//print the LinkedList
	public void printlist() {
		Node currNode=head;
		
		while(currNode!=null) {
			System.out.print(currNode.data+"->");
			currNode=currNode.next;
		}
		
		System.out.println("NULL");
	}
	
	//size of the linked list
	public int getSize() {
		return size;
	}

	public static void main(String[] args) {
		LL list = new LL();
		list.addfirst("a");
		list.addfirst("is");
		list.printlist(); //is->a->NULL
		
		list.addLast("list");
		list.printlist(); //is->a->list->NULL
		
		list.addfirst("This");
		list.printlist(); //This->is->a->list->NULL
		
		/*list.deletefirst(); //is->a->list->NULL
		list.deltelast();  //is->a->NULL
		list.printlist();*/
		
		System.out.println(list.getSize());
		
		//to print the index of the searched element
		String key="list";
        int index = list.Search(key);

        if (index != -1) {
            System.out.println(key + " found at index " + index);
        } else {
            System.out.println(key + " not found in the linked list ");
        }

	}

}
