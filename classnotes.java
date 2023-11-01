import java.util.*;
public class classnotes {
	void Prog_Sep12() {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n = sc.nextInt();*/
		int[] arr = new int[5];
		
		/*System.out.println("Enter " + n + " elements");
		
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}*/
		
		/*for(int i =0; i<n; i++) {
			System.out.print(arr[i]+" ");	
			}*/
		
		int top = -1;
		System.out.println(arr.length);
		 if(top != 4)
		 {
			 top+=1;
			 arr[top]=3;
			 
			// System.out.print(arr[top]);
		 }
		 
		 for(int j =0; j<=top; j++) {
			 
				System.out.print(arr[j]+" ");	
		 }	
		
		
	}
	
	void Prog_Sep13() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n = sc.nextInt();
		
		int stack[];
		stack =new int[n];
		int max_size = stack.length-1;
		System.out.println(max_size);
		
		//implement of push operation
		int top =-1;
		for(int i=top; i<max_size; i++) {
			if(top==max_size) {
				System.out.println("Stack is full");
				break;
			}
				
		}
			
			
			for(int i1=0; i1<=max_size; i1++) {
				System.out.println(stack[i1]+" ");
			}
			System.out.print(" ");
		
		//implementation of pop oprn
			if(top==-1) {
				System.out.println("Stack is Empty");
			}
			else {
				stack[top]=0;
				top=top-1;
				System.out.println(top);
			}
		
		for(int i=0; i<=max_size; i++) {
			System.out.print(stack[i]+" ");
		}
		
	}
	
	void prog_Sept14() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n = sc.nextInt();
		
		int queue[];
		queue=new int[n];
		int max = queue.length-1;
		System.out.println("Max index: "+max);
		
		int front=-1;
		int rear=-1;
		
		if(rear==max) {
			return;
		}
		else if(rear==-1) {
			rear=front=0;
		}
		else {
			rear++;
			
		}
		
		System.out.print("Required queue is:"+" ");
		for(rear=0; rear<=queue.length; rear++) {
			queue[rear]=sc.nextInt();
			
		}
		
		
		
	}
	
	void prog_Sept14_deq(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the queue:");
		int n = sc.nextInt();
		
		int queue[];
		queue=new int[n];
		
		System.out.print("Required queue is:"+" ");
		for(int i = 0; i<n; i++) {
			queue[i] = sc.nextInt();
		}
		
		int front=-1;
		int rear =-1;
		
		if(front==-1 && front>rear) {
			System.out.print("Underflow");
		}
		else if(front!=rear) {
			int y=queue[front];
			front=rear=0;
		}
		else {
			front+=1;
		}
		
		int h = queue[front];
		System.out.print("removed element:"+h);
		
	}
	
	void enque() {
		// Create a queue
        Queue<Integer> queue = new LinkedList<>();

        // Add elements to the queue
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("Queue: " + queue);

        // Add another element
        queue.offer(40);

        System.out.println("Queue after adding 40: " + queue);
    
	}
	
void dequeue1() {
	// Create a queue
    Queue<Integer> queue = new LinkedList<>();

    // Add elements to the queue
    queue.offer(10);
    queue.offer(20);
    queue.offer(30);

    System.out.println("Queue: " + queue);

    // Remove an element
    int removedElement = queue.poll();
    
    System.out.println("Removed element: " + removedElement);
    System.out.println("Queue after removal: " + queue);
}
	public static void main(String[] args) {
		classnotes obj = new classnotes();
		//obj.Prog_Sep12();
		//obj.Prog_Sep13();
		//obj.prog_Sept14();
		//obj.prog_Sept14_deq();
		//obj.enque();
		obj.dequeue1();
	}

}
