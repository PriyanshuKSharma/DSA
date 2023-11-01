import java.util.*;
public class ArraysExample {
	
	void array() {
		int[] ages = new int[3];
		float[] weight = new float[3];
		String[] names = {"rahul", "raj", "araadhya", "vaishali"};
		
		ages[0] = 34;
		ages[1] = 12;
		ages[2] = 45;
		
		weight[0]=23.8f;
		weight[1]=87.5f;
		weight[2] = 56.8f;
		
		
		/*System.out.println(ages[0]);
		System.out.println(ages[1]);
		System.out.println(ages[2]);
		
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		
		System.out.println(ages.length);
		System.out.println(names.length);
		System.out.println(weight.length);*/
		
		 // printing array using for loop
		/*for(int i=0; i<3; i++) {
			System.out.println(ages[i]);
		}*/
		
		 // printing array using for each loop
		/*for(int age:ages) {
			System.out.println(age);
		}*/
		
		//printing array using while loop
		int i=0;
		while(i<ages.length) {
			System.out.println(ages[i]);
			i+=1;
		}
		
		
		
	}
	void multiarr() {
		// int[][] arr_1=new int[5][3];
		int[][] arr= {{56,43,6}, {34,7,8}, {12,56,8}, {17,54,88}};
		
		/*System.out.println(arr[0][0]); //56
		System.out.println(arr[0][1]); //43
		System.out.println(arr[0][2]); //6
		
		System.out.println(arr[1][0]); //34
		System.out.println(arr[1][1]); //7
		System.out.println(arr[1][2]); //8*/
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		
	}
	
	void ArrInp() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter " + n + " elements");
		
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		
		//trying to copy arr to arr_2
		int[] arr_2 = arr;
		for(int i =0; i<n; i++) {
			System.out.print(arr_2[i]+" ");	
			}
	}
	
	void pushprac() {
	
		Stack<Integer> stk = new Stack<Integer>(); 
		// inserting elements into the stack 
		stk.push(52); 
		stk.push(19); 
		stk.push(33); 
		stk.push(14); 
		stk.push(6); 
		System.out.print("The stack is: " + stk); 
		
	}
	
	int popprac() {
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of the array:");
			int n = sc.nextInt();
			int[] stack = new int[n];
			
			System.out.println("Enter " + n + " elements");
			
			for(int i = 0; i<n; i++) {
				stack[i] = sc.nextInt();
			}
		
		
		int top = 0;
		if(top == -1) {
			int value = -1;
			System.out.println("Stack is empty i.e. underflow:"+value);
			return -1;
		}
		
		else {
			return stack[top--];
		}
		/*if (top >= 0) 
		   { return stack[top--]; 
		   } 
		   else { 
			   System.out.println("Stack is empty."); 
			   return -1; 
			   }*/
		
	}
		
	void pop2() {
		
	Stack<Integer> stk = new Stack<Integer>(); 
	// Inserting elements into the stack 
	stk.push(52); 
	stk.push(19); 
	stk.push(33); 
	stk.push(14); 
	stk.push(6); 
	System.out.print("The stack is: " + stk); 
	// Deletion from the stack 
	System.out.print("\nThe popped element is: "); 
	Integer n = (Integer) 
	stk.pop(); 
	System.out.print(n);
	
	} 

	
	public static void main(String[] args) {
		ArraysExample obj = new ArraysExample();
		// obj.array(); //to print array method
		//obj.multiarr(); //to print multiarr method
		
		//obj.ArrInp(); // to print copy of the array
		//obj.pushprac(); //to print stack
		
		/*int value1 = obj.popprac();
		System.out.println("Popped value: "+value1);*/ //to print the popped value
		
		obj.pop2();
		}

}
