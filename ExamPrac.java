import java.io.InputStream;
import java.util.*;
public class ExamPrac {

	int pop() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of elemnts");
		int n = sc.nextInt();
		int[] stack = new int[n];
		int Max_index = n-1;
		
		System.out.print("Enter "+n+" elements");
		for(int i=0; i<n; i++) {
			stack[i]=sc.nextInt();
		}
		
		int top = Max_index;
		if(top==-1) {
			return -1;
			
		}
		else {
			
			return stack[top];
			
		}
		
		
	}
	
	void push() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of elements");
		int n = sc.nextInt();
		int[] stack = new int[n];
		int Max_index = n-1;
		
		System.out.print("Enter "+n+" elements");
		for(int i=0; i<n; i++) {
			stack[i]=sc.nextInt();
		}
		
		int top = Max_index;
		if(top==n-1) {
			System.out.println("Overflow");
		}
		
		else {
			top+=1;
		}
		
		System.out.print("Stack is: ");
		for(int i=0; i<=top; i++) {
			System.out.print(stack[i]);
		}
	}

	

	public static void main(String[] args) {
		ExamPrac obj = new ExamPrac();
		/*int value= obj.pop();
		System.out.print("Popped elements: "+value);*/
		obj.push();

	}

}
