import java.util.*;
public class ArraysExam2 {
	
	static void printArray(int[] arr) {
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");	
			}
		System.out.println();
		
			
		}
	
	static void changeArr(int[] arr_3) {
		for(int i =0; i<arr_3.length; i++) {
			System.out.print(arr_3[i]+" ");
			
			}
		System.out.println();
		
	}
	
	
	

	public static void main(String[] args) {
		ArraysExam2 obj =new ArraysExam2();
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the size of the array:");
		//int n = sc.nextInt();
		int[] arr = new int[5];
		
		arr[0]=15;
		arr[1]=25;
		arr[2]=6;
		arr[3]=63;
		arr[4]=67;
		
		
		System.out.println("Original Array: ");
		printArray(arr);
		
		
		
		//trying to copy arr to arr_2
		//int[] arr_2 = arr.clone();
		//int[] arr_2 = Arrays.copyOf(arr, arr.length); //copies the array same as it is
		int[] arr_2 = Arrays.copyOfRange(arr, 0, 2); //copies the array of the given range
		System.out.println("Duplicate Array: ");
		printArray(arr_2);
		
		//changing some values of arr_2
		arr_2[0]=0;
		arr_2[1]=10;
		
		System.out.println("Original array after changing arr_2");
		printArray(arr);
		
		System.out.println("Copied array after changing arr_2");
		printArray(arr_2);
		
		int[] arr_3 = new int[3];
		arr[0] = 6;
		arr[1] = 8;
		arr[2] = 15;
		
		System.out.println("Pass by value");
		changeArr(arr_3);
		printArray(arr_3);
		
		
		
	}

	}

