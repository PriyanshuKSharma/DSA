import java.util.Scanner;
public class QuePrac {
	//Linear Searching in Array
	void QuePrac1() {
		//Calculate the sum of all the elements in the given array
		int[] array= {1,2,9,7,8,3};
		int sum=0;
		
		for(int i=0; i<array.length; i++) {
			sum+=array[i];			
		}
		System.out.print(sum);
		
	}
	
	void QuePrac2() {
		//Calculate the maximum value out of all the elements in the array
		int[] array1= {5,3,6,2,8,1};
		
		int ans=0;
		
		for(int i=0; i<array1.length; i++) {
			if(array1[i]>ans) {
				ans=array1[i];
			}
			
		}
		
		System.out.print(ans);
		
	}
	
	void QuePrac3() {
		//Search the given element x in the array. If present then return the index else return -1
		int[] array2= {2,4,6,10};
		int x=6;
		int ans=-1;
		for(int i=0; i<array2.length; i++) {
			if(array2[i]==x) {
				ans=i;
			}		
		
		}
		System.out.print("Found " + x + "\tat index " + ans);
	}
	
	//Count the number of occurrences of a particular element x.
	static int countOcurrences(int[] arr, int x) {
		int count = 0;
		for(int i =0; i<arr.length; i++) {
			if(arr[i]==x) {
				count++;
			}
		}
		return count;
		
	}

	public static void main(String[] args) {
		QuePrac obj=new QuePrac();
		//obj.QuePrac1();
		//obj.QuePrac2();
		//obj.QuePrac3();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter " + n + " elements");
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter x:");
		int x = sc.nextInt();
		
		System.out.println("Count of X:" + countOcurrences(arr, x));

	}

}

